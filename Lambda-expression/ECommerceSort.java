import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 75000, 4.5, 10),
            new Product("Phone", 30000, 4.7, 15),
            new Product("Headphones", 2000, 4.2, 25),
            new Product("Monitor", 12000, 4.3, 5)
        );

        sortProducts(products, "price");
        sortProducts(products, "rating");
        sortProducts(products, "discount");
    }

    static void sortProducts(List<Product> products, String criteria) {
        Comparator<Product> comparator = switch (criteria) {
            case "price" -> Comparator.comparingDouble(p -> p.price);
            case "rating" -> Comparator.comparingDouble(p -> -p.rating);
            case "discount" -> Comparator.comparingDouble(p -> -p.discount);
            default -> null;
        };

        if (comparator != null) {
            products.sort(comparator);
            System.out.println("\nSorted by " + criteria + ":");
            products.forEach(System.out::println);
        } else {
            System.out.println("\nInvalid sorting criteria.");
        }
    }
}