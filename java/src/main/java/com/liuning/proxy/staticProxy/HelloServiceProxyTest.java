package com.liuning.proxy.staticProxy;

import com.liuning.proxy.Hello;
import com.liuning.proxy.HelloImpl;

/**
 * 静态代理测试类
 *
 * @author liuning
 * @since 2020-10-29 23:10
 */
public class HelloServiceProxyTest {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        HelloSeriviceProxy helloSeriviceProxy = new HelloSeriviceProxy(hello);

        helloSeriviceProxy.sayHello();
    }
}
