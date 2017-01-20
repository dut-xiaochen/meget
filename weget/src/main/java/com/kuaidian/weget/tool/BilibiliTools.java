package com.kuaidian.weget.tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kuaidian.weget.service.CacheService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhai on 2017/1/19.
 */
@Service("bilibliTools")
public class BilibiliTools {
    private final Logger logger = Logger.getLogger(BilibiliTools.class);
    private CacheService cacheService;

    @Autowired
    public void setCacheService(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    public List<Map> getRealkUrlByUrl(String url) throws UnsupportedEncodingException {
        List<Map> redisResult = cacheService.getRealUsrlsFromCache(url);
        if (redisResult != null) {
            //TODO:根据视频链接判断是否过期
            if (false) {
                //如果没有过期 直接返回数据
                return redisResult;
            }

        }
        String command = "python3 /Users/zhai/Workspaces/you-get/you-get --timeout 10 --json " + url;
        InputStream inputStream = null;
        Process p = null;
        List<Map> returnMapList = new ArrayList();
        try {
            p = Runtime.getRuntime().exec(command);
            inputStream = p.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder result = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            String formatResult = "[" + result.toString() + "]";
            JSONArray resultArray = JSON.parseArray(formatResult);
            if (resultArray != null && !resultArray.isEmpty()) {
                for (int i = 0; i < resultArray.size(); i++) {
                    JSONObject resultObj = resultArray.getJSONObject(i);
                    Map<String, Object> returnMap = new HashMap();
                    String videoTitle = resultObj.getString("title");
                    returnMap.put("videoTitle", videoTitle);
                    JSONObject videoStreams = resultObj.getJSONObject("streams");
                    List<String> srcUrls = new ArrayList();
                    if (videoStreams != null) {
                        JSONObject videoDefault = videoStreams.getJSONObject("__default__");
                        if (videoDefault != null) {
                            String videoType = videoDefault.getString("container");
                            returnMap.put("videoType", videoType);
                            JSONArray videoSrcArray = videoDefault.getJSONArray("src");
                            if (videoSrcArray != null) {
                                for (int j = 0; j < videoSrcArray.size(); j++) {
                                    srcUrls.add(videoSrcArray.get(j) + "");
                                }
                            }
                            returnMap.put("videoSrcArray", srcUrls);
                        } else {
                            returnMap.put("videoType", "");
                            returnMap.put("videoSrc", srcUrls);
                        }
                    } else {
                        returnMap.put("videoType", "");
                        returnMap.put("videoSrc", srcUrls);
                    }
                    returnMapList.add(returnMap);
                }
                cacheService.saveRealUrlsToCache(url, returnMapList);
                return returnMapList;
            } else {
                return null;
            }
        } catch (IOException e) {
            logger.error("catch Error :" + e);
        } finally {
            if (p != null) {
                p.destroy();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    logger.error("catch Error :" + e);
                }
            }
        }
        return null;
    }
}