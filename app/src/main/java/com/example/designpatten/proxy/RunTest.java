package com.example.designpatten.proxy;

import java.lang.reflect.Proxy;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class RunTest {

    public static void main(String[] args) {
        //静态代理
//        Customer customer = new Customer();
//        Lawyer lawyer = new Lawyer(customer);
//        lawyer.law();

        //代理目标对象
        Customer customer = new Customer();
        //代理回调类
        MyHandler myHandler = new MyHandler(customer);
        //生成代理对象Proxy通过调用newProxyInstance方法生成代理对象，传入该类的classLoader，实现接口，InvocationHandler
        Law proxy = (Law) Proxy.newProxyInstance(Customer.class.getClassLoader(), customer.getClass().getInterfaces(), myHandler);
        proxy.law();

    }
}
