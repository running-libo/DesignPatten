package com.example.designpatten.builder;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */
class LouFangHouseBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("建造楼房地板");
    }

    @Override
    public void makeWall() {
        house.setWall("建造楼房墙");
    }

    @Override
    public void makeTop() {
        house.setTop("建造楼房屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
