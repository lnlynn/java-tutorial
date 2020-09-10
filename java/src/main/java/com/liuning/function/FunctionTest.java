package com.liuning.function;

import java.util.function.Function;

/**
 * Function接收一个参数T，调用apply，然后返回参数R
 *
 * @author liuning
 * @since 2020-09-10 23:32
 */
public class FunctionTest {

    public static void main(String[] args) {
        Function<Integer, String> function = num -> num.toString().concat(" point");

        String output = function.compose(num -> (Integer) num+1)
                .andThen(str -> str.concat(" after"))
                .apply(99);

        System.out.println(output);
    }
}
