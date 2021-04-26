package com.example.designpatten.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */

/**
 * 实现动态代理的核心接口，动态代理本质采用的java反射机制实现
 */
class MyHandler implements InvocationHandler {
    private Customer  customer;

    public MyHandler(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("搜集证据");
        Object obj = method.invoke(customer, args);  //使用反射调用customer中的method方法
        System.out.println("打赢官司");
        return obj;
    }
}
