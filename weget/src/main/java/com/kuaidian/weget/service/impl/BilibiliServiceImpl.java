package com.kuaidian.weget.service.impl;

import com.kuaidian.weget.service.BilibiliService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("bilibliService")
public class BilibiliServiceImpl implements BilibiliService {
    public List<Map> getRealUrlsByUrl(String url) {
        return null;
    }

    public void saveRealUrlsToCache(String key, List<String> urls) {

    }
}
