package com.example.designpatten.factoryfun;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */
interface FruitFactory {
    //生产水果，具体水果类型根据具体工厂来决定
    Fruit getFruit();
}
