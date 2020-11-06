package com.liuning.concurrent;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(20));
        System.out.println(random.nextDouble());

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        System.out.println(threadLocalRandom.nextFloat());
    }
}
