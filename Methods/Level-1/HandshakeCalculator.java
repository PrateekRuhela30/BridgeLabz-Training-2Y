import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int handshakes = calculateHandshakes(students);
        System.out.println("Number of handshakes: " + handshakes);
    }
}