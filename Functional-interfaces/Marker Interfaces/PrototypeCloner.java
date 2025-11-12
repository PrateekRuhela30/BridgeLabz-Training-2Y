class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(" Cloning not supported.");
            return null;
        }
    }

    public String toString() {
        return "Product: " + name + ", Price: ₹" + price;
    }
}

public class PrototypeCloner {
    public static void main(String[] args) {
        Product original = new Product("Laptop", 75000);
        Product copy = original.clone();

        System.out.println(" Original: " + original);
        System.out.println(" Clone: " + copy);
    }
}