package com.liuning.stream;

import java.util.stream.Stream;

/**
 * @author liuning
 * @since 2020-08-08 23:32
 */
public class IteratrTest {
    int x = 1;

    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new IteratrTest().numbers()
                .skip(20) // 过滤前 20 个
                .limit(30) // 然后取 10 个
                .forEach(System.out::println);
    }
}
