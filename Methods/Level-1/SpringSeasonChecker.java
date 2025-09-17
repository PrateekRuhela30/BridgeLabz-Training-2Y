import java.util.Scanner;

public class SpringSeasonChecker {
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 6 && day <= 20) return true;
        if (month > 3 && month < 6) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        boolean spring = isSpringSeason(month, day);
        if (spring) {
            System.out.println("Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}