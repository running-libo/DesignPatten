package com.example.designpatten.simplefactory;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */
class RunTest {

    public static void main(String[] args) {

        Fruit apple = FruitFactory.getFruit("apple");  //传入apple的type，创建Apple实例
        apple.get();

        Fruit pear = FruitFactory.getFruit("pear");
        pear.get();
    }
}
