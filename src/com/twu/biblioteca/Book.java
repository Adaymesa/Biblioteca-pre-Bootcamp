package com.twu.biblioteca;

/**
 * Created by adaymesa on 15/01/2017.
 */
public class Book {

    private String title;
    private String author;
    private String year;


    public Book (String t, String a, String y) {
        this.title = t;
        this.author = a;
        this.year = y;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getYear(){
        return year;
    }
}
