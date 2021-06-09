package com.xiaoliu66.github;
/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 22:30
 * @version 1.0
 * 使用类的内部类（线程安全，懒汉模式，不会因为加锁而降低性能）推荐使用
 */
public class Singleton_05 {
    private static class SingletonHolder {
        private static Singleton_05 instance = new Singleton_05();
    }

    private Singleton_05() {

    }

    public static Singleton_05 getInstance() {
        return SingletonHolder.instance;
    }

}
