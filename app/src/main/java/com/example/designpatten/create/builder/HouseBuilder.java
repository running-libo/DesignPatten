package com.example.designpatten.create.builder;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */

/**
 * 创建一个对象，我们创建一个Builder类，将属性的设置使用方法来设置
 */
interface HouseBuilder {

    //建造地板
    void makeFloor();

    //建造墙
    void makeWall();

    //建造房顶
    void makeTop();

    //建造对象
    House getHouse();
}
