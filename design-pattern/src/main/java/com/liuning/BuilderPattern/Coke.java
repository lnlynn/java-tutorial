package com.liuning.BuilderPattern;

import com.liuning.BuilderPattern.impl.ColdDrink;

/**
 * Coke
 *
 * @author liuning
 * @since 2020-09-18 23:35
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
