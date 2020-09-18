package com.liuning.BuilderPattern.impl;

import com.liuning.BuilderPattern.Packing;

/**
 * Bottle
 *
 * @author liuning
 * @since 2020-09-18 23:31
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
