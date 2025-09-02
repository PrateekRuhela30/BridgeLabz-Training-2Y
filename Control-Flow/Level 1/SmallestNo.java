
import java.util.Scanner;

public class SmallestNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int min;

        // Initialize min with num1
        min = num1;

        // Compare with num2 and num3 to find the smallest number
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Smallest no. is: " + min);
    }
}