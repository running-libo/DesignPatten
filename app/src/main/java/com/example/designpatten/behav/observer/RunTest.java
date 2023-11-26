package com.example.designpatten.behav.observer;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */
class RunTest {

    public static void main(String[] args) {

        //创建一个观察者文章作者
        ArticelOperation article = new ArticelOperation();
        //添加各个观察者进行监听
        article.addObserver(new Observer());
        article.addObserver(new Observer2());

        //作者发布文章
        article.publish("Android进阶解密", "解读Android源码", "刘皇叔");
    }
}
