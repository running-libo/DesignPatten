package com.example.designpatten.create.abstractfactory;


/**
 * create by apple
 * create on 2021/4/25
 * description
 */
class RunTest {

    public static void main(String[] args) {

         FruitFactory jkFruitFactory = new FruitJKFactory();
         Fruit appleJk = jkFruitFactory.getApple();
         appleJk.get();  //生产进口苹果


         FruitFactory gcFruitFactory = new FruitGCFactory();
         Fruit bananaGc = gcFruitFactory.getBanana();
         bananaGc.get(); //生产国产香蕉

    }
}
