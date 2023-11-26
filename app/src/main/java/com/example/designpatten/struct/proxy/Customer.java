package com.example.designpatten.struct.proxy;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */

/**
 * 目标类：某个客户需要打官司
 */
class Customer implements Law {

    @Override
    public void law() {
        System.out.println("上法庭陈述事实");
    }
}
