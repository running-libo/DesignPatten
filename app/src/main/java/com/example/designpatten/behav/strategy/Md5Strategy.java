package com.example.designpatten.behav.strategy;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */
class Md5Strategy implements Strategy {

    @Override
    public void encrypt() {
        System.out.println("MD5加密");
    }
}
