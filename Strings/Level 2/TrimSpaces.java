import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] startEnd = trimSpaces(input);
        String customTrimmed = substring(input, startEnd[0], startEnd[1]);
        String builtInTrimmed = input.trim();

        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");

        boolean isEqual = compareStrings(customTrimmed, builtInTrimmed);
        System.out.println("Are they equal? " + isEqual);
    }

    public static int[] trimSpaces(String str) {
        int length = findLength(str);
        int start = 0;
        while (start < length && str.charAt(start) == ' ') {
            start++;
        }
        int end = length;
        while (end > start && str.charAt(end - 1) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String substring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        int len1 = findLength(str1);
        int len2 = findLength(str2);
        if (len1 != len2) {
            return false;
        }
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
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
