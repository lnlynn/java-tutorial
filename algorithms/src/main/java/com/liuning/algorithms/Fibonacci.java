package com.liuning.algorithms;

/**
 * Fibonacci
 *
 * @author liuning
 * @since 2020-09-03 23:55
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.print(Fibonacci_2(45));
    }

    /**
     * 递归
     **/
    public static long Fibonacci_1(long n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibonacci_1(n - 1) + Fibonacci_1(n - 2);
    }

    /**
     * 迭代
     **/
    public static long Fibonacci_2(long n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;

        int last = 1;
        int nextToLast = 0;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = last + nextToLast;

            nextToLast = last;
            last = result;
        }
        return result;
    }
}
