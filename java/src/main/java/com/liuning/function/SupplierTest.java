package com.liuning.function;

import java.util.function.Supplier;

/**
 * Supplier无输入参数，直接返回一个值
 *
 * @author liuning
 * @since 2020-09-10 23:44
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "LiuNing";

        System.out.println(supplier.get());
    }
}
