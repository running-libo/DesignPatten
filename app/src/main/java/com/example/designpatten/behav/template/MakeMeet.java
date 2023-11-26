package com.example.designpatten.behav.template;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */

/**
 * 炒肉
 */
class MakeMeet extends MakeFood {

    @Override
    void prepare() {
        System.out.println("准备肉");
    }

    @Override
    void doing() {
        System.out.println("炒肉");
    }

    @Override
    void carryOut() {
        System.out.println("装盘");
    }
}
