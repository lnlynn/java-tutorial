package com.liuning.SingletonPattern;

/**
 * 单例模式测试
 *
 * @author liuning
 * @since 2020-09-17 23:06
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingletonOne singletonOne = SingletonOne.getInstance();
        singletonOne.helloWorld();

        SingletonSix singletonSix = SingletonSix.INSTANCE;
        singletonSix.whateverMethod();
    }
}
