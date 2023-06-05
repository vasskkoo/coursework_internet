package com.example.internet.items;

public class ReviewsInfo {
    private String id;
    private String person;
    private String textreview;

    public ReviewsInfo(String id, String person, String textreview){
        this.id = id;
        this.person = person;
        this.textreview = textreview;
    }

    public String getId() {
        return id;
    }
    public String getPerson() {
        return person;
    }
    public String getTextreview() {
        return textreview;
    }
}