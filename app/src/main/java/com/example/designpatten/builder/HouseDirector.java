package com.example.designpatten.builder;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */

/**
 * 指挥者类，指挥建造者去建造
 */
class HouseDirector {
    HouseBuilder houseBuilder;

    HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 设计建造房子的操作过程
     */
    public House make() {
        houseBuilder.makeFloor();
        houseBuilder.makeWall();
        houseBuilder.makeTop();

        return houseBuilder.getHouse();
    }
}
