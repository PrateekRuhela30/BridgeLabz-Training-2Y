import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean isPalindrome1 = isPalindromeLoop(input);
        boolean isPalindrome2 = isPalindromeRecursive(input, 0, findLength(input) - 1);
        boolean isPalindrome3 = isPalindromeReverse(input);

        System.out.println("Using loop: " + isPalindrome1);
        System.out.println("Using recursion: " + isPalindrome2);
        System.out.println("Using reverse: " + isPalindrome3);
    }

    public static boolean isPalindromeLoop(String text) {
        int length = findLength(text);
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeReverse(String text) {
        String reversed = reverseString(text);
        return text.equals(reversed);
    }

    public static String reverseString(String text) {
        int length = findLength(text);
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}
