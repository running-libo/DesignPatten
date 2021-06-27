package com.example.designpatten.proxy.dynamic;

/**
 * create by apple
 * create on 2021/6/27
 * description
 */
class Bye implements ByeInterface {
    @Override
    public void sayBye() {
        System.out.println("这里是被代理类Bye");
    }
}
