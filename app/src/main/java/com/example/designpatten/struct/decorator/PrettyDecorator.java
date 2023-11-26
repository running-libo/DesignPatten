package com.example.designpatten.struct.decorator;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class PrettyDecorator extends Decorator {

    public PrettyDecorator(Person person) {
        super(person);
    }

    @Override
    public void show() {
        pretty();
        person.show();
    }

    public void pretty() {
        System.out.println("帅");
    }
}
