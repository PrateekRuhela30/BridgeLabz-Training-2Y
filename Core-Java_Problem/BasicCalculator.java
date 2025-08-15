import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        double additionResult = number1 + number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult = number1 / number2;

        System.out.println("The addition value of " + number1 + " and " + number2 + " is " + additionResult);
        System.out.println("The subtraction value of " + number1 + " and " + number2 + " is " + subtractionResult);
        System.out.println("The multiplication value of " + number1 + " and " + number2 + " is " + multiplicationResult);
        System.out.println("The division value of " + number1 + " and " + number2 + " is " + divisionResult);

        input.close();
    }
}
}