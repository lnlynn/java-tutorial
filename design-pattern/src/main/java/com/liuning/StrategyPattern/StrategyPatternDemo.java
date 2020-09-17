package com.liuning.StrategyPattern;

import com.liuning.StrategyPattern.impl.OperationAdd;
import com.liuning.StrategyPattern.impl.OperationMultiply;
import com.liuning.StrategyPattern.impl.OperationSubtract;

/**
 * StrategyPatternDemo
 *
 * @author liuning
 * @since 2020-09-17 23:49
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
