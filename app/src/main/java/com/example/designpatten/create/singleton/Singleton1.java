package com.example.designpatten.create.singleton;

/**
 * 饿汉式
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton;
    }

}
