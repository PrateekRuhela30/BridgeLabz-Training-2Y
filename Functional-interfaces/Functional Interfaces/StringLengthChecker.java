import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character limit: ");
        int limit = getValidInt(scanner);

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        Function<String, Integer> lengthFunction = str -> str.length();

        int messageLength = lengthFunction.apply(message);

        if (messageLength > limit) {
            System.out.println(" Message exceeds character limit by " + (messageLength - limit) + " characters.");
        } else {
            System.out.println(" Message is within the character limit.");
        }

        scanner.close();
    }

    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}