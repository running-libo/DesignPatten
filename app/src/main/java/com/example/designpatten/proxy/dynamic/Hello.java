package com.example.designpatten.proxy.dynamic;

/**
 * create by apple
 * create on 2021/6/27
 * description
 */
class Hello implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("这里是被代理类Hello");
    }
}
