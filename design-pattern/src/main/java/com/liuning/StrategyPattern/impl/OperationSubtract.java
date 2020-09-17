package com.liuning.StrategyPattern.impl;

import com.liuning.StrategyPattern.Strategy;

/**
 * OperationSubtract
 *
 * @author liuning
 * @since 2020-09-17 23:47
 */
public class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
