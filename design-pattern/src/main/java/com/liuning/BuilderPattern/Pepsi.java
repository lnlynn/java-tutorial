package com.liuning.BuilderPattern;

import com.liuning.BuilderPattern.impl.ColdDrink;

/**
 * Pepsi
 *
 * @author liuning
 * @since 2020-09-18 23:36
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
