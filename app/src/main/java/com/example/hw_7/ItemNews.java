package com.example.hw_7;

import java.io.Serializable;

public class ItemNews implements Serializable {
    String title;
    String news;

    public ItemNews(String title, String news) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
