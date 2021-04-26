package com.example.designpatten.decorator;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class HeightDecorator extends Decorator {

    public HeightDecorator(Person person) {
        super(person);
    }

    @Override
    public void show() {
        height();
        person.show();
    }

    /**
     * 去修饰高属性
     */
    public void height() {
        System.out.println("高");
    }
}
