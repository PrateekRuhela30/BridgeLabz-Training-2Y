import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = takeInput(sc);
        int max = findMaximum(numbers);
        System.out.println("Maximum: " + max);
    }

    public static int[] takeInput(Scanner sc) {
        int[] nums = new int[3];
        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();
        System.out.print("Enter third number: ");
        nums[2] = sc.nextInt();
        return nums;
    }

    public static int findMaximum(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
