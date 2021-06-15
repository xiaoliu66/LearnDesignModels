package com.xiaoliu66.github.one.service;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 21:20
 * @version 1.0
 */
public interface CacheTypeService {
    String get(final String key,String redisType);

    void set(String key, String value,String redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit,String redisType);

    void del(String key,String redisType);
}
