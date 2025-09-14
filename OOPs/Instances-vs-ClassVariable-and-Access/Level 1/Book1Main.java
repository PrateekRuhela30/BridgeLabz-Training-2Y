package com.icvm;

public class Book1Main {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Effective Java", "Joshua Bloch", 5.6);
        ebook.displayInfo();
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
