package com.example.designpatten.observer;

/**
 * create by apple
 * create on 2021/4/27
 * description
 */
class Article {

    private String title;
    private String content;
    private String author;

    public String getTitle() {
        return title == null ? "" : title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content == null ? "" : content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author == null ? "" : author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
