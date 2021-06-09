package com.xiaoliu66.github;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 22:28
 * @version 1.0
 * 饿汉模式 (线程安全)
 */
public class Singleton_04 {
    private static Singleton_04 instance = new Singleton_04();

    private Singleton_04() {

    }

    public static Singleton_04 getInstance() {
        return instance;
    }
}
