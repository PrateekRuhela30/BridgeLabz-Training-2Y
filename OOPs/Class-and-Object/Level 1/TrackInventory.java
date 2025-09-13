package com.gla;

public class TrackInventory {
    int itemCode;
    String itemName;
    int price;

    public TrackInventory(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void itemDetails(){
        System.out.println("Item Details");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);

    }
}
