import java.util.Arrays;
import java.util.Scanner;

public class CharArrayCreation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.next();
        char[] customArray = getCharArray(text);
        char[] builtInArray = text.toCharArray();
        boolean match = compareCharArrays(customArray, builtInArray);
        System.out.println("Custom array: " + Arrays.toString(customArray));
        System.out.println("Built-in array: " + Arrays.toString(builtInArray));
        System.out.println("Arrays match: " + match);
    }

    public static char[] getCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
