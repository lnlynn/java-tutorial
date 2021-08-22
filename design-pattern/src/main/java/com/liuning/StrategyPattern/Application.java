package com.liuning.StrategyPattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * StrategyPatternDemo
 *
 * @author liuning
 * @since 2020-09-17 23:49
 */
public class Application {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream(ClassLoader.getSystemClassLoader().getResource("config.properties").getPath()));
        String type = properties.getProperty("calculate.type");

        Context context = new Context(StrategyFactory.getStrategy(type));
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
    }
}
