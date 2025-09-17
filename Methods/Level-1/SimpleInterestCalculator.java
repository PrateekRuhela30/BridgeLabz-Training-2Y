import java.util.Scanner;

public class SimpleInterestCalculator {
    public static double calculateInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double interest = calculateInterest(principal, rate, time);
        System.out.println("Simple Interest is " + interest);
    }
}