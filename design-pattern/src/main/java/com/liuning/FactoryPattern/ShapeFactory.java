package com.liuning.FactoryPattern;

import com.liuning.FactoryPattern.impl.Circle;
import com.liuning.FactoryPattern.impl.Rectangle;
import com.liuning.FactoryPattern.impl.Square;

/**
 * ShapeFactory
 *
 * @author liuning
 * @since 2020-09-16 23:18
 */
public class ShapeFactory {

    public static Shape getShape(String shapeType) {

        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
        }
        return null;
    }
}
