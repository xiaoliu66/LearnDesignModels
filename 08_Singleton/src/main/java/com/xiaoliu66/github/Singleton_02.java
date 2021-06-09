package com.xiaoliu66.github;
/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 22:10
 * @version 1.0
 * 懒汉模式（线程不安全）
 */
public class Singleton_02 {
    private static Singleton_02 instance;

    private Singleton_02() {

    }

    public static Singleton_02 getInstance() {
        if (null != instance) return instance;
        instance = new Singleton_02();
        return instance;
    }
}
