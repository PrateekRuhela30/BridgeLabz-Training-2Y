import java.util.Scanner;

public class CharacterFrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] freqData = findCharacterFrequency(input);
        System.out.println("Character\tFrequency");
        for (String data : freqData) {
            if (data != null) {
                String[] parts = data.split(":");
                System.out.println(parts[0] + "\t\t" + parts[1]);
            }
        }
    }

    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + ":" + freq[i];
            }
        }
        return result;
    }
}
