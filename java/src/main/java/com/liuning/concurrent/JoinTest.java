package com.liuning.concurrent;

/**
 * Thread.join测试
 *
 * @author liuning
 * @since 2020-10-30 23:09
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadA.start();
        threadB.start();

        long start = System.currentTimeMillis();
        System.out.println("ThreadA,ThreadB start.");

        threadA.join();
        threadB.join();

        //主线程会等待线程A、B执行完成后再执行
        System.out.println("ThreadA,ThreadB stop.");
        System.out.println("cost is"+ (System.currentTimeMillis() - start));

    }
}
