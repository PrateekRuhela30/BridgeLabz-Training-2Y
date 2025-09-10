import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        generateStringIndexOutOfBoundsException(text);
        handleStringIndexOutOfBoundsException(text);
    }

    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println(text.charAt(text.length())); // index equal to length, out of bounds
    }

    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
