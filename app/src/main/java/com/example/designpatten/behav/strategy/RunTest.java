package com.example.designpatten.behav.strategy;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */
class RunTest {

    public static void main(String[] args) {

        Context context = new Context(new Md5Strategy());
//        Context context = new Context(new DesStrategy());
        context.encrypt();
    }
}
