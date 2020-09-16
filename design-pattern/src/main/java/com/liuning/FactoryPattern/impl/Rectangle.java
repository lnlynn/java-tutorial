package com.liuning.FactoryPattern.impl;

import com.liuning.FactoryPattern.Shape;

/**
 * Rectangle
 *
 * @author liuning
 * @since 2020-09-16 23:06
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
