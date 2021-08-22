package com.liuning.StrategyPattern.impl;

import com.liuning.StrategyPattern.Strategy;

/**
 * OperationAdd
 *
 * @author liuning
 * @since 2020-09-17 23:44
 */
public class AddStrategy implements Strategy {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
