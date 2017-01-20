package com.kuaidian.weget.service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhai on 2017/1/19.
 */

public interface CacheService {

    void saveRealUrlsToCache(String key, List<Map> urls);

    List<Map> getRealUsrlsFromCache(String key);
}
