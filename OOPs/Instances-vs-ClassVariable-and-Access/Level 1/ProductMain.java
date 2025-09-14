package com.icvm;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 120000);
        Product p2 = new Product("Smartphone", 80000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
