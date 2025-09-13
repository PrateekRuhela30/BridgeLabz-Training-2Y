package com.gla;

public class MobilePhone {
    String brand;
    String model;
    int price;

    public MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void mobileDetail(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
