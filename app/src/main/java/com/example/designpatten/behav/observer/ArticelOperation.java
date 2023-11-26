package com.example.designpatten.behav.observer;

import java.util.Observable;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */

/**
 * 被观察者需要继承Observable接口
 */
class ArticelOperation extends Observable {

    /**
     * 发布一篇文章
     */
    public void publish(String title, String content, String author) {
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setAuthor(author);
        this.setChanged();  //通知状态改变

        this.notifyObservers(article); //通知所有观察者对象状态改变了
    }
}
