package com.liuning.FactoryPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * FactoryPatternDemo
 *
 * @author liuning
 * @since 2020-09-16 23:19
 */
public class FactoryPatternDemo {

    public static void main(String[] args) throws IOException {

        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("SQUARE");
        shape3.draw();

        System.out.println("反射模式实现工厂模式");
        Shape shape4 = ShapeFactory.getShapeReflect("com.liuning.FactoryPattern.impl.Circle");
        shape4.draw();

        String filePath = System.getProperty("user.dir") + "/design-pattern/src/test/resources/application.properties";
        File file = new File(filePath);

        Properties pro = new Properties();
        pro.load(new FileInputStream(file));
        System.out.println(pro.getProperty("circle"));
    }
}
