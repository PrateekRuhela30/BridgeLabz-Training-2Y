package com.gla;

public class CartItemMain {
    public static void main(String[] args) {
        CartItem item = new CartItem("Apple", 200, 5);
        System.out.println("Item added to cart:");
        item.displayItem();

        System.out.println("Total cost: " + item.getTotalPrice());

        item.quantity = 0;
        System.out.println("Item removed from cart.");

        System.out.println("Total cost: " + item.getTotalPrice());
    }
}
