package com.xiaoliu66.github;
/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 22:10
 * @version 1.0
 * 懒汉模式（线程安全）一般不建议使用
 */
public class Singleton_03 {
    private static Singleton_03 instance;

    private Singleton_03() {

    }

    public static synchronized Singleton_03 getInstance() {
        if (null != instance) return instance;
        instance = new Singleton_03();
        return instance;
    }
}
