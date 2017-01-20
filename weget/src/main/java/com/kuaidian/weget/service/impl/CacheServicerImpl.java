package com.kuaidian.weget.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.kuaidian.weget.service.CacheService;
import com.kuaidian.weget.system.RedisClient;
import com.kuaidian.weget.tool.RedisTools;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhai on 2017/1/19.
 */
@Service("cacheService")
public class CacheServicerImpl implements CacheService {
    public void saveRealUrlsToCache(String key, List<Map> urls) {
        RedisClient redisClient = RedisTools.getRedisClient();
        redisClient.sAdd(key, JSONArray.toJSONString(urls));
    }

    public List<Map> getRealUsrlsFromCache(String key) {
        RedisClient redisClient = RedisTools.getRedisClient();
        String result = redisClient.get(key);
        return JSONArray.parseArray(result, Map.class);
    }
}
