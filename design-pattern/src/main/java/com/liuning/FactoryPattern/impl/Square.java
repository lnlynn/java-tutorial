package com.liuning.FactoryPattern.impl;

import com.liuning.FactoryPattern.Shape;

/**
 * Square
 *
 * @author liuning
 * @since 2020-09-16 23:09
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
