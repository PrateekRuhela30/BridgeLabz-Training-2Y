import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqData = findCharacterFrequency(input);
        System.out.println("Character\tFrequency");
        for (String[] row : freqData) {
            if (row[0] != null) {
                System.out.println(row[0] + "\t\t" + row[1]);
            }
        }
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];
        int length = findLength(text);

        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
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
