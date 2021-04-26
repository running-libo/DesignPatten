package com.example.designpatten.strategy;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */
class DesStrategy implements Strategy {

    @Override
    public void encrypt() {
        System.out.println("DES加密");
    }
}
