package com.example.designpatten.behav.observer;

import java.util.Observable;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */
class Observer implements java.util.Observer {

    @Override
    public void update(Observable o, Object arg) {
        Article article = (Article) arg;

        System.out.println(getClass().getSimpleName() + "  " + article.getTitle());
        System.out.println(getClass().getSimpleName() + "  " + article.getContent());
        System.out.println(getClass().getSimpleName() + "  " + article.getAuthor());

    }
}
