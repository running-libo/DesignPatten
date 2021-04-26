package com.example.designpatten.decorator;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class RichDecorator extends Decorator {

    public RichDecorator(Person person) {
        super(person);
    }

    @Override
    public void show() {
        rich();
        person.show();
    }

    public void rich() {
        System.out.println("富");
    }
}
