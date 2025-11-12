import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter threshold temperature: ");
        double threshold = getValidDouble(scanner);

        System.out.print("Enter current temperature: ");
        double currentTemp = getValidDouble(scanner);

        Predicate<Double> isTemperatureHigh = temp -> temp > threshold;

        if (isTemperatureHigh.test(currentTemp)) {
            System.out.println(" Alert: Temperature has crossed the threshold!");
        } else {
            System.out.println(" Temperature is within safe limits.");
        }

        scanner.close();
    }

    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}