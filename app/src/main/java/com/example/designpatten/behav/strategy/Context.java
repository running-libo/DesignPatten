package com.example.designpatten.behav.strategy;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */

/**
 * 策略的容器类
 */
class Context {

    public Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        strategy.encrypt();
    }
}
