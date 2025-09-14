package com.icvm;

public class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(){
        System.out.println("Default Constructer");
    }
}
