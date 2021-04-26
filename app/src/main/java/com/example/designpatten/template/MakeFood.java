package com.example.designpatten.template;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */

/**
 * 定义做饭的抽象,将具体做的细节延迟到子类去实现
 */
public abstract class MakeFood {

    //准备食材
    abstract void prepare();

    //进行做饭
    abstract void doing();

    //装盘
    abstract void carryOut();

    //再将操作步骤统一起来
    public void make() {
        prepare();
        doing();
        carryOut();
    }
}
