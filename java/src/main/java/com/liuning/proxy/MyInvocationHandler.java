package com.liuning.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理
 *
 * @author liuning
 * @since 2020-10-27 22:24
 */
class MyInvocationHandler implements InvocationHandler {

    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("动态代理执行前");
        Object result = method.invoke(target, args);
        System.out.println("动态代理执行后");
        return result;
    }
}
