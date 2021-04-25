package com.example.designpatten.abstractfactory;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */

/**
 * 生产进口水果
 */
class FruitJKFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new AppleJK();
    }

    @Override
    public Fruit getBanana() {
        return new BananaJK();
    }
}
