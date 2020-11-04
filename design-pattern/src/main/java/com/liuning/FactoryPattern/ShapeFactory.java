package com.liuning.FactoryPattern;

import com.liuning.FactoryPattern.impl.Circle;
import com.liuning.FactoryPattern.impl.Rectangle;
import com.liuning.FactoryPattern.impl.Square;

import java.util.NoSuchElementException;

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
            default: throw new NoSuchElementException();
        }
    }

    /**
     * 使用反射机制实现工厂模式
     *
     * @param className 类名
     * @return 对象
     */
    public static Shape getShapeReflect(String className) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(className).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return shape;
    }

}
