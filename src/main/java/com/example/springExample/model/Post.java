package com.example.springExample.model;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private String description;
    private String author;
    //zmienna statyczna będzie taka sama dla wszystkich obiektow
    private static List<Post> allPosts = new ArrayList<>();


    public static List<Post> findAll(){
        return allPosts;
    }


    public Post(String title, String description, String author) {
        this.title = title;
        this.description = description;
        this.author = author;
        allPosts.add(this);

    }

    public Post() {
        allPosts.add(this);
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
        return "Autor: "+ getAuthor()+ " Tytuł: "+getTitle()+ " Opis: "+getDescription();
    }
}
