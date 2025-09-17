public class ArrayAnalysis {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, -3, 8, 0, 5};
        for (int num : arr) {
            if (isPositive(num)) System.out.println(num + " is " + (isEven(num) ? "Even" : "Odd"));
            else System.out.println(num + " is Negative");
        }
        int result = compare(arr[0], arr[arr.length - 1]);
        System.out.println("First vs Last: " + (result == 0 ? "Equal" : result > 0 ? "Greater" : "Less"));
    }
}