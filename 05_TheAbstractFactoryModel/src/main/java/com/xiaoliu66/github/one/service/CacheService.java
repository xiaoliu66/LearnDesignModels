package com.xiaoliu66.github.one.service;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 21:07
 * @version 1.0
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
