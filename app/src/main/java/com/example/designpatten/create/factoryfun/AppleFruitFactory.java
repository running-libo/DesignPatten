package com.example.designpatten.create.factoryfun;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */

/**
 * 苹果工厂，负责创建苹果
 */
class AppleFruitFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
