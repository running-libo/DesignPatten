package com.example.designpatten.factoryfun;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */
class RunTest {

    public static void main(String[] args) {

        FruitFactory appleFactory = new AppleFruitFactory();
        appleFactory.getFruit().get();

        FruitFactory pearFactory = new PearFruitFactory();
        pearFactory.getFruit().get();
    }
}
