import java.util.Scanner;

public class FeetConverter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the distance in feet: ");
            double distanceInFeet = input.nextDouble();
            double distanceInYards = distanceInFeet / 3.0;
            double distanceInMiles = distanceInYards / 1760.0;
            System.out.println("The distance in yards is " + distanceInYards + " and the distance in miles is " + distanceInMiles);
        }
    }
}
