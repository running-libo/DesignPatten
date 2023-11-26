package com.example.designpatten.create.simplefactory;

/**
 * create by apple
 * create on 2021/4/25
 * description
 */
public class FruitFactory {

    /**
     * 简单工厂的方法，根据传入的参数，创建对应的子类实例，返回类型是父类或接口
     * @param type
     * @return
     */
    public static Fruit getFruit(String type) {
        if (type.equals("apple")) {
            return new Apple();
        } else if (type.equals("pear")) {
            return new Pear();
        }

        return null;
    }
}
