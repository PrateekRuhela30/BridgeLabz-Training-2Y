import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number");
            sc.close();
            return;
        }
        
        // Using formula
        double formulaSum = n * (n + 1) / 2.0;
        
        // Using while loop
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + sum);
        if (formulaSum == sum) {
            System.out.println("Both computations are correct");
        } else {
            System.out.println("Computations differ");
        }
        
        sc.close();
    }
}
