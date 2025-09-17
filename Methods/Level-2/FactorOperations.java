public class FactorOperations {
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

    public static int product(int[] arr) {
        int result = 1;
        for (int val : arr) result *= val;
        return result;
    }

    public static double sumOfSquares(int[] arr) {
        double total = 0;
        for (int val : arr) total += Math.pow(val, 2);
        return total;
    }

    public static void main(String[] args) {
        int num = 12;
        int[] factors = getFactors(num);
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}