package com.liuning.BuilderPattern.impl;

import com.liuning.BuilderPattern.Packing;

/**
 * Wrapper
 *
 * @author liuning
 * @since 2020-09-18 23:30
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
