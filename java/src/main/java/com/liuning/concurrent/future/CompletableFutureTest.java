package com.liuning.concurrent.future;

import java.util.concurrent.*;

/**
 * CompletableFuture的supplyAsync方法，提供了异步执行的功能，线程池也不用单独创建了。
 * 实际上，它CompletableFuture使用了默认线程池是ForkJoinPool.commonPool。
 *
 * @author liuning
 * @since 2021-06-07 23:28
 */
public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long startTime = System.currentTimeMillis();

        //调用Hello服务获取Hello字符串
        CompletableFuture<String> helloFutureTask = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        });

        //模拟主线程其它操作耗时
        Thread.sleep(300);

        CompletableFuture<String> worldFutureTask = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "World";
        });

        String hello = helloFutureTask.join();
        String world = worldFutureTask.get();
        System.out.println(hello + world);

        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }
}
