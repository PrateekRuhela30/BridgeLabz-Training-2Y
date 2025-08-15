import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        System.out.print("Enter the first integer (dividend): ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer (divisor): ");
        int number2 = input.nextInt();

        int quotient = number1 / number2;

        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);

        input.close();
    }
}
}