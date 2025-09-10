import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        generateIllegalArgumentException(text);
        handleIllegalArgumentException(text);
    }

    public static void generateIllegalArgumentException(String text) {
        System.out.println(text.substring(2, 1)); // start > end
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println(text.substring(2, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
