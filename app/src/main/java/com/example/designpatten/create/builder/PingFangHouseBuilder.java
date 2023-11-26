package com.example.designpatten.create.builder;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */
class PingFangHouseBuilder implements HouseBuilder {
    //为了让调用着不接触House对象，即客户不直接建造房子，我们通过builder来建造House
    //在Builder内部来操作house对象
    private House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("建造平房地板");
    }

    @Override
    public void makeWall() {
        house.setWall("建造平房墙");
    }

    @Override
    public void makeTop() {
        house.setTop("建造平房屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
