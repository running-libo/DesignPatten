package com.example.designpatten.singleton;

/**
 * create by libo
 * create on 2021/6/23
 * description
 */
public class SingleTon {

    private SingleTon() {}

    public static SingleTon getInstance() {
        return SingleTonHolder.instance;
    }

    private static class SingleTonHolder {
        private static SingleTon instance = new SingleTon();
    }
}
