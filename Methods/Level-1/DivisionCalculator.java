import java.util.Scanner;

public class DivisionCalculator {
    public static int[] findRemainderAndQuotient(int number1, int number2) {
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int[] result = findRemainderAndQuotient(number1, number2);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}