public class Product {
    private static double discount = 10.0;

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 10000.0, 5, "P001");
        prod1.displayDetails();
        Product.updateDiscount(15.0);
        prod1.displayDetails();
    }
}
