package com.liuning.FactoryPattern;

/**
 * FactoryPatternDemo
 *
 * @author liuning
 * @since 2020-09-16 23:19
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
