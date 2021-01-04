package com.liuning.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * Fork Join
 *
 * @author liuning
 * @since 2020-11-12 23:52
 */
public class ForkJoinCalculte extends RecursiveTask<Long> {
    private final long start;
    private final long end;
    public static final int THRESHOLD = 2;

    public ForkJoinCalculte(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long sum = 0;
        boolean flag = (end - start) <= THRESHOLD;
        if (flag) {
            for (long i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            long middle = (end + start) / 2;
            // divide task
            ForkJoinCalculte leftTask = new ForkJoinCalculte(start, middle);
            ForkJoinCalculte rightTask = new ForkJoinCalculte(middle + 1, end);
            // execute sub task
            leftTask.fork();
            rightTask.fork();
            // get result sub task
            long left = leftTask.join();
            long right = rightTask.join();
            sum = left + right;
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinCalculte task = new ForkJoinCalculte(1, 99);
        Future<Long> result = pool.submit(task);
        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}
