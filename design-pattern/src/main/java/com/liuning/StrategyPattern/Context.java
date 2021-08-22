package com.liuning.StrategyPattern;

/**
 * Context
 *
 * @author liuning
 * @since 2020-09-17 23:48
 */
public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.calculate(num1, num2);
    }
}
