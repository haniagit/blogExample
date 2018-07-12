package com.example.springExample.model;

public class Mem {

    private String title;
    private String imageUrl;

    public Mem(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public Mem() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Nazwa mema: " + getTitle();
    }
}
