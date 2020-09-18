package com.liuning.BuilderPattern.impl;

import com.liuning.BuilderPattern.Item;
import com.liuning.BuilderPattern.Packing;

/**
 * ColdDrink
 *
 * @author liuning
 * @since 2020-09-18 23:32
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
