import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char toRemove = sc.next().charAt(0);

        String result = removeCharacter(input, toRemove);
        System.out.println("Modified string: " + result);
    }

    public static String removeCharacter(String str, char toRemove) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != toRemove) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
