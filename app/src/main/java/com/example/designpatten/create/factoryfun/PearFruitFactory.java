package com.example.designpatten.create.factoryfun;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */

/**
 * 梨工厂，负责创建梨
 */
class PearFruitFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
