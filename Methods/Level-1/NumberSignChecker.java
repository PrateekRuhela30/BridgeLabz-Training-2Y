import java.util.Scanner;

public class NumberSignChecker {
    public static int checkSign(int number) {
        if (number < 0) return -1;
        if (number == 0) return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = checkSign(number);
        System.out.println("Sign result: " + result);
    }
}