package com.liuning.enums;

public enum Planet {
    Mercury(3.3, 2.4),
    VENUS(4.8, 6.0),
    EARTH(5.9, 6.3),
    ;

    //枚举内所有的域都应该是final的
    private final double mass;
    private final double radius;
    private final double gravity;

    private final double G = 6.6;

    //在构造器中用g=G*M/(r*r)计算出重力加速度
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.gravity = G * mass / (radius * radius);
    }

    public double getMass() { return mass; }
    public double getRadius() { return radius; }
    public double getGravity() { return gravity; }

    //计算质量为mass物体的力
    public double surfaceWeight(double mass) {
        return mass * gravity;
    }
}
