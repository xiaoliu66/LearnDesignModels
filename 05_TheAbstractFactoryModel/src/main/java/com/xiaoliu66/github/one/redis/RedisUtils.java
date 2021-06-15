package com.xiaoliu66.github.one.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 20:53
 * @version 1.0
 */
public class RedisUtils {
    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private Map<String, String> dataMap = new ConcurrentHashMap();

    public String getKey(String key) {
        logger.info("Redis获取数据 key:{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("Redis写入数据 key:{} value:{}", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Redis写入数据 key:{} value:{} timeout:{} timeUnit:{}", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void del(String key) {
        logger.info("Redis删除数据 key:{}", key);
        dataMap.remove(key);
    }
}
