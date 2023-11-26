package com.example.designpatten.behav.template;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */

/**
 * 做一个西红柿鸡蛋
 */
class MakeTomatoEgg extends MakeFood {

    @Override
    void prepare() {
        System.out.println("准备西红柿鸡蛋");
    }

    @Override
    void doing() {
        System.out.println("抄西红柿鸡蛋");
    }

    @Override
    void carryOut() {
        System.out.println("装盘");
    }
}
