package com.liuning.BuilderPattern.impl;

import com.liuning.BuilderPattern.Item;
import com.liuning.BuilderPattern.Packing;

/**
 * Burger
 *
 * @author liuning
 * @since 2020-09-18 23:32
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
