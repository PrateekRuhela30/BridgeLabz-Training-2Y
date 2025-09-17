public class NaturalNumberSum {
    public static int recursiveSum(int n) {
        if (n <= 1) return n;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10;
        int r = recursiveSum(n);
        int f = formulaSum(n);
        System.out.println("Recursive Sum: " + r);
        System.out.println("Formula Sum: " + f);
        System.out.println("Match: " + (r == f));
    }
}