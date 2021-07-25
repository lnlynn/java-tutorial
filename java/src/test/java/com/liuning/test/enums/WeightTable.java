package com.liuning.test.enums;

import com.liuning.enums.Planet;

/**
 * 美爵Planet测试
 *
 * @author liuning
 * @since 2021-07-25 23:54
 */
public class WeightTable {

    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("Weight on %s is %f%n", planet, planet.surfaceWeight(200));
        }
    }
}
