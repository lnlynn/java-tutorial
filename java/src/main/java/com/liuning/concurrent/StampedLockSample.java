package com.liuning.concurrent;

import java.util.concurrent.locks.StampedLock;

/**
 * StampedLock
 *
 * @author liuning
 * @since 2021-03-09 23:01
 */
public class StampedLockSample {

    private final StampedLock sl = new StampedLock();

//    void mutate() {
//        long stamp = sl.writeLock();
//        try {
//            write();
//        } finally {
//            sl.unlockWrite(stamp);
//        }
//    }
//
//    Data access() {
//        long stamp = sl.tryOptimisticRead();
//        Data data = read();
//        if (!sl.validate(stamp)) {
//            stamp = sl.readLock();
//            try {
//                data = read();
//            } finally {
//                sl.unlockRead(stamp);
//            }
//        }
//        return data;
//    }
}
