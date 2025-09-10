import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for F to C, 2 for C to F: ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println("Celsius: " + celsius);
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println("Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
