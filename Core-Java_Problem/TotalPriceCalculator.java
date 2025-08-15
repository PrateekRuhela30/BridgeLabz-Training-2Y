import java.util.Scanner;

public class TotalPriceCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        
        input.close();
    }
}
}