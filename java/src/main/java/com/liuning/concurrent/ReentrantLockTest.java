package com.liuning.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁测试
 *
 * @author liuning
 * @since 2021-03-09 21:59
 */
public class ReentrantLockTest {

    public static void main(String[] args) {

        ReentrantLock fairLock = new ReentrantLock(true);
        fairLock.lock();
        try {
            // do something
        } finally {
            fairLock.unlock();
        }
    }
}
