package com.liuning.concurrent.future;

import java.util.concurrent.*;

/**
 * Future是Java5新加的一个接口，它提供了一种异步并行计算的功能。如果主线程需要执行一个很耗时的计算任务，
 * 我们就可以通过future把这个任务放到异步线程中执行。主线程继续处理其他任务，处理完成后，再通过Future获取计算结果。
 *
 * @author liuning
 * @since 2021-06-07 22:23
 */
public class FutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        long startTime = System.currentTimeMillis();

        //调用Hello服务获取Hello字符串
        FutureTask<String> helloFutureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws InterruptedException {
                Thread.sleep(300);
                return "Hello";
            }
        });
        executorService.submit(helloFutureTask);

        //模拟主线程其它操作耗时
        Thread.sleep(300);

        FutureTask<String> worldFutureTask = new FutureTask<>(() -> {
            Thread.sleep(500);
            return "World";
        });
        executorService.submit(worldFutureTask);

        String hello = helloFutureTask.get();
        String world = worldFutureTask.get();
        System.out.println(hello + world);

        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }
}
