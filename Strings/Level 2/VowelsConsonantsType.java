import java.util.Scanner;

public class VowelsConsonantsType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] charTypes = getCharTypes(input);
        displayTable(charTypes);
    }

    public static String checkVowelConsonant(char ch) {
        char lower = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            return "Vowel";
        } else if (lower >= 'a' && lower <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] getCharTypes(String str) {
        int length = findLength(str);
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkVowelConsonant(str.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
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
