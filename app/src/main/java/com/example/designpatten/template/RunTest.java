package com.example.designpatten.template;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */
class RunTest {

    public static void main(String[] args) {
        MakeFood makeFood = new MakeTomatoEgg();
//        MakeFood makeFood = new MakeMeet();
        makeFood.make();
    }
}
