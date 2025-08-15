import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        final int FEET_PER_YARD = 3;
        final int YARDS_PER_MILE = 1760;

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / FEET_PER_YARD;

        double distanceInMiles = distanceInYards / YARDS_PER_MILE;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}
}