package com.liuning.function;

import java.util.function.Predicate;

/**
 * @author liuning
 * @description Predicate
 * @since 2020-08-23 23:07
 */
public class PredicateTest {

    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.equals("zhangsan");

        System.out.println(predicate.test("lisi"));
        System.out.println("--- --- --- --- --- ---");
        System.out.println(predicate.test("zhangsan"));

        System.out.println(compareValue(4, num -> num > 3));
        System.out.println(compareValue(5, value -> value % 2 == 0));

        System.out.println(multiCompareValue(6, value -> value % 2 == 0, value -> value > 4));
    }

    public static boolean compareValue(int value, Predicate<Integer> predicate) {
        return predicate.test(value);
    }

    public static boolean multiCompareValue(int value, Predicate<Integer> predicateOne, Predicate<Integer> predicateTwo) {
        return predicateOne.and(predicateTwo).test(value);
    }
}
