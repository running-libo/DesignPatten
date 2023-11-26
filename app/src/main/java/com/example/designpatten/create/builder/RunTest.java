package com.example.designpatten.create.builder;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */
class RunTest {

    public static void main(String[] args) {


        HouseBuilder houseBuilder = new PingFangHouseBuilder(); //创建某种楼房建造者
//        HouseBuilder houseBuilder = new LouFangHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);  //创建楼房指挥者，让指挥者指挥建造者
        houseDirector.make(); //指挥者调用建造去建造

        System.out.println(houseBuilder.getHouse().getFloor());
        System.out.println(houseBuilder.getHouse().getWall());
        System.out.println(houseBuilder.getHouse().getTop());
    }
}
