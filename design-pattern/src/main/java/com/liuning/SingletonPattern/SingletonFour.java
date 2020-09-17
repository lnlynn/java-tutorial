package com.liuning.SingletonPattern;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * @author liuning
 * @since 2020-09-17 22:49
 */
public class SingletonFour {

    private volatile static SingletonFour singleton;

    private SingletonFour() {
    }

    public static SingletonFour getSingleton() {
        if (singleton == null) {
            synchronized (SingletonFour.class) {
                if (singleton == null) {
                    singleton = new SingletonFour();
                }
            }
        }
        return singleton;
    }
}
