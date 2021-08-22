package com.liuning.StrategyPattern;

import com.liuning.StrategyPattern.impl.AddStrategy;
import com.liuning.StrategyPattern.impl.MultiplyStrategy;
import com.liuning.StrategyPattern.impl.SubtractStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 *
 * @author liuning
 * @since 2021-08-22 23:09
 */
public class StrategyFactory {

    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new AddStrategy());
        strategies.put("B", new MultiplyStrategy());
        strategies.put("C", new SubtractStrategy());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
