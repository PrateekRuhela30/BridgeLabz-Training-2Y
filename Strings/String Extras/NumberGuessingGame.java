import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        int low = 1;
        int high = 100;
        int guess = generateGuess(low, high);
        String feedback;

        do {
            System.out.println("My guess: " + guess);
            System.out.print("Is it high, low, or correct? ");
            feedback = sc.nextLine().toLowerCase();
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
            guess = generateGuess(low, high);
        } while (!feedback.equals("correct"));

        System.out.println("I guessed it!");
    }

    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }
}
