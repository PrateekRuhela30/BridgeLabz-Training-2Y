package com.icvm;

public class Book1 {
    public String ISBN;
    protected String title;
    private String author;

    public Book1(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book1 {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayInfo() {
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
        System.out.println("Author (via getter): " + getAuthor());
        System.out.println("File Size (MB): " + fileSizeMB);
    }
}
