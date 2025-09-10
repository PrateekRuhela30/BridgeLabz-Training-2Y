import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }
        generateArrayIndexOutOfBoundsException(names);
        handleArrayIndexOutOfBoundsException(names);
    }

    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        System.out.println(names[3]); // index 3, length 3, so out of bounds
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
