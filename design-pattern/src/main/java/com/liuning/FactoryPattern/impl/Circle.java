package com.liuning.FactoryPattern.impl;

import com.liuning.FactoryPattern.Shape;

/**
 * Circle
 *
 * @author liuning
 * @since 2020-09-16 23:16
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
