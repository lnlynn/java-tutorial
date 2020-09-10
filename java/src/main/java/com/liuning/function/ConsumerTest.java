package com.liuning.function;

import java.util.function.Consumer;

/**
 * Consumer接收一个泛型的参数T，然后调用accept，对这个参数做一系列的操作，没有返回值
 *
 * @author liuning
 * @since 2020-09-10 22:59
 */
public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<String> consumer = str -> {
            String strNew = str.concat("liuning");
            System.out.println(strNew);
        };

        consumer.andThen(str -> System.out.println("andThenOne"))
                .andThen(str -> System.out.println(str.concat("Two")))
                .accept("hello");
    }
}
