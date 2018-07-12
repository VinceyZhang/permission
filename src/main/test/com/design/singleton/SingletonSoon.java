package com.design.singleton;

/**
 * 立即加载模式
 */
public class SingletonSoon {

    private static SingletonSoon singletonSoon = new SingletonSoon();

    public static SingletonSoon getInstance() {
        return singletonSoon;
    }
}
