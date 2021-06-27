package com.example.designpatten.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * create by apple
 * create on 2021/6/27
 * description
 */
class ProxyHandler implements InvocationHandler {
    private Object object;

    //需要传入Object类型，任意类型
    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //invoke中使用反射调用传入的被代理对象的方法
        System.out.println("before invoke" + method.getName());
        method.invoke(object, args);
        System.out.println("after invoke" + method.getName());
        return null;
    }
}
