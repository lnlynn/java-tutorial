package com.liuning.StrategyPattern.impl;

import com.liuning.StrategyPattern.Strategy;

/**
 * OperationMultiply
 *
 * @author liuning
 * @since 2020-09-17 23:47
 */
public class MultiplyStrategy implements Strategy {

    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}
