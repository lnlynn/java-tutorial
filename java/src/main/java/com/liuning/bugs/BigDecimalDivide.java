package com.liuning.bugs;

import java.math.BigDecimal;

/**
 * BigDecimal的除法
 *
 * @author liuning
 * @since 2020-10-09 23:54
 */
public class BigDecimalDivide {

    /**
     *BigDecimal的除法返回无限循环小数时会报错，必须指定精度
     */
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(3);
        System.out.println(a.divide(b));
        System.out.println(a.divide(b, 2, BigDecimal.ROUND_HALF_UP));
    }
}
