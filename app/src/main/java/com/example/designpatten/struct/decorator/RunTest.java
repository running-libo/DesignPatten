package com.example.designpatten.struct.decorator;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class RunTest {

    public static void main(String[] args) {
        //因为具体的Person和Decorator都继承过Person接口，所有两者可以相互替换
        //创建对象，创建需要的包装类，连续将包装过的装饰者继续装饰
        Person concreatePerson = new ConcreatePerson();
        Decorator decorator = new HeightDecorator(concreatePerson);
        Decorator decorator1 = new RichDecorator(decorator);
        Decorator decorator2 = new PrettyDecorator(decorator1);

        decorator2.show();
    }
}
