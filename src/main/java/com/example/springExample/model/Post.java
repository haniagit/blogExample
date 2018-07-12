package com.example.springExample.model;

public class Post {
    private String title;
    private String description;
    private String author;

    public Post() {
    }

    public Post(String title, String description, String author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Autor: "+ getAuthor()+" Tytuł: "+getTitle()+" Opis: "+getDescription();
    }
}
