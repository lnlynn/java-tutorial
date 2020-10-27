package com.liuning.proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author liuning
 * @since 2020-10-27 22:19
 */
public class DynamicProxy {

    public static  void main (String[] args) {
        HelloImpl hello = new HelloImpl();
        MyInvocationHandler handler = new MyInvocationHandler(hello);
        // 构造代码实例
        Hello proxyHello = (Hello) Proxy.newProxyInstance(HelloImpl.class.getClassLoader(), HelloImpl.class.getInterfaces(), handler);
        // 调用代理方法
        proxyHello.sayHello();
    }

}

