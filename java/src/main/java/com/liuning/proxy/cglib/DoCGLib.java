package com.liuning.proxy.cglib;

import com.liuning.proxy.HelloImpl;

public class DoCGLib {

    public static void main(String[] args) {
        CGLibProxy proxy = new CGLibProxy();
        //通过生成子类的方式创建代理类
        HelloImpl proxyImp = (HelloImpl)proxy.getProxy(HelloImpl.class);
        proxyImp.sayHello();
    }
}
