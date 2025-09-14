package com.icvm;

public class Library {
    String title;
    String auther;
    int price;
    int availability;

    public Library(String title, String auther, int price, int availability){
        this.title = title;
        this.auther = auther;
        this.price = price;
        this.availability = availability;

    }
    public void borrowBook(){
        System.out.println("Borrow a book");
        if(availability>0){
            System.out.println("You have borrowed the book");
            availability--;
        }
        else{
            System.out.println("Sorry this booko is not available.");
        }
    }
    public static void main(String[] args) {
        Library b1 = new Library("Java Basics", "Jane Doe", 1000, 2);
        b1.borrowBook();
        b1.borrowBook();
        b1.borrowBook();
    }
}
