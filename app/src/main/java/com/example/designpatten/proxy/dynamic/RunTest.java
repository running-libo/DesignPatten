package com.example.designpatten.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class RunTest {

    public static void main(String[] args) {
        HelloInterface hello = new Hello();  //创建需要被代理的Hello类对象
        ByeInterface bye = new Bye();

        //此时，不再创建具体的代理对象，而是用Proxy.newProxyInstance利用反射生成代理对象
        InvocationHandler invocationHandler = new ProxyHandler(hello);
        InvocationHandler byeHandler = new ProxyHandler(bye);

        //通过Proxy类的静态方法newProxyInstance返回一个接口的代理实例（注，这里需要强转）。针对不同的代理类，传入相应的代理程序控制器InvocationHandler。
        //newProxyInstance需传入三个参数：分别传入被代理对象的classloader、interface，和创建的invocationHandler，
        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), invocationHandler);
        proxyHello.sayHello(); //通过调用代理接口的方法，调用到了invocationHandler的invoke方法，从而调用到了被代理对象的方法

        ByeInterface proxyBye = (ByeInterface) Proxy.newProxyInstance(bye.getClass().getClassLoader(), bye.getClass().getInterfaces(), byeHandler);
        proxyBye.sayBye();
    }
}
