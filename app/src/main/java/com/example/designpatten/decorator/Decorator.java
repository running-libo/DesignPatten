package com.example.designpatten.decorator;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */

/**
 * 创建Decorator类，持有Person对象，对Person的实例进行包装
 */
abstract class Decorator implements Person {
    protected Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public abstract void show();
}
