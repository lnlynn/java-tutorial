package com.liuning.BuilderPattern;

import com.liuning.BuilderPattern.impl.Burger;

/**
 * ChickenBurger
 *
 * @author liuning
 * @since 2020-09-18 23:35
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}