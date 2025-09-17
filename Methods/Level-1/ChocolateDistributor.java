import java.util.Scanner;

public class ChocolateDistributor {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int eachGets = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachGets, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}