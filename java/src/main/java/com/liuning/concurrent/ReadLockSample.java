package com.liuning.concurrent;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁测试
 *
 * @author liuning
 * @since 2021-03-09 22:58
 */
public class ReadLockSample {

    private final Map<String, String> m = new TreeMap<>();
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    private final Lock readLock = rwl.readLock();
    private final Lock writeLock = rwl.writeLock();

    public String get(String key) {
        readLock.lock();
        System.out.println("读锁锁定！");
        try {
            return m.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public String put(String key, String entry) {
        writeLock.lock();
        System.out.println("写锁锁定！");
        try {
            return m.put(key, entry);
        } finally {
            writeLock.unlock();
        }
    }
}

