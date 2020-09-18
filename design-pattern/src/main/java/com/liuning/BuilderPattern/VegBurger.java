package com.liuning.BuilderPattern;

import com.liuning.BuilderPattern.impl.Burger;

/**
 * VegBurger
 *
 * @author liuning
 * @since 2020-09-18 23:34
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}