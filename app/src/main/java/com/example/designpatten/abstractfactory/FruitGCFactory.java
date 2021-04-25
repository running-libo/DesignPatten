package com.example.designpatten.abstractfactory;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */

/**
 * 生产国产水果
 */
class FruitGCFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new AppleGC();
    }

    @Override
    public Fruit getBanana() {
        return new BananaGC();
    }
}
