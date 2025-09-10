import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean isAnagram = checkAnagram(str1, str2);
        System.out.println("Are anagrams: " + isAnagram);
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[256];
        for (char c : str1.toCharArray()) {
            freq[c]++;
        }
        for (char c : str2.toCharArray()) {
            freq[c]--;
        }
        for (int f : freq) {
            if (f != 0) {
                return false;
            }
        }
        return true;
    }
}
