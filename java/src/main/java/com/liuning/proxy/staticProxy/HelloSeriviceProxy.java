package com.liuning.proxy.staticProxy;

import com.liuning.proxy.Hello;

public class HelloSeriviceProxy implements Hello {

    private final Hello target;

    public HelloSeriviceProxy(Hello target) {
        this.target = target;
    }

    @Override
    public void sayHello() {
        System.out.println("记录日志");
        target.sayHello();
        System.out.println("清理数据");
    }
}