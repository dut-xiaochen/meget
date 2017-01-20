package com.kuaidian.weget.tool;

import com.kuaidian.weget.system.RedisClient;

/**
 * Created by zhai on 2017/1/19.
 */
public class RedisTools {
    public static RedisClient getRedisClient() {
        String ip = "localhost";
        int port = 6379;
        int timeout = 3000;
        String auth = "";
        return new RedisClient(ip, port, timeout, auth);
    }
}