import java.util.Scanner;

public class TriangleAreaConverter {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        final double CENTIMETERS_PER_INCH = 2.54;

        System.out.print("Enter the base of the triangle (in cm): ");
        double baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double heightCm = input.nextDouble();

        double areaSqCm = 0.5 * baseCm * heightCm;

        double baseIn = baseCm / CENTIMETERS_PER_INCH;
        double heightIn = heightCm / CENTIMETERS_PER_INCH;

        double areaSqIn = 0.5 * baseIn * heightIn;

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);

        input.close();
    }
}
}