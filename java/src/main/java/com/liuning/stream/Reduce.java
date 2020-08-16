package com.liuning.stream;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Stream reduce
 *
 * @author liuning
 * @since 2020-08-16 23:18
 */
public class Reduce {

    public static void main(String[] args) {

        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        System.out.println(accumulator.apply(99, 2));

        /**
         * reduce操作定义了一个初始值0
         */
        int count1 = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);
        System.out.println(count1);

        /**
         * 没有初始值的情况下，reduce的第一步使用Stream中的前两个元素。
         * 有时，reduce操作不存在有意义的初始值，这样做就是有意义的，此时，reduce方法返回一个Optional对象
         */
        Optional<Integer> count2 = Stream.of(1, 2, 3)
                .reduce( (acc, element) -> acc + element);
        System.out.println(count2.get());

        /**
         * Optional
         */
        Optional<String> optional = Optional.of("Str");
        Optional emptyOptional = Optional.empty();
        Optional<String> alsoEmpty = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        System.out.println(emptyOptional.isPresent());
        System.out.println(alsoEmpty.orElse("str"));
        System.out.println(alsoEmpty.orElseGet(() -> "string".substring(0,3)));

    }
}
