import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequent = findMostFrequent(input);
        System.out.println("Most frequent character: " + mostFrequent);
    }

    public static char findMostFrequent(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        char mostFrequent = ' ';
        int maxFreq = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequent = (char) i;
            }
        }
        return mostFrequent;
    }
}
