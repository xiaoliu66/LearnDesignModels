package com.xiaoliu66.github;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 22:02
 * @version 1.0
 * 静态类单例
 */
public class Singleton_01 {
    public static Map<String,String> cache = new ConcurrentHashMap<>();
}
