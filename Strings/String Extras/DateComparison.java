import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String date1Str = sc.nextLine();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String date2Str = sc.nextLine();

        LocalDate date1 = LocalDate.parse(date1Str);
        LocalDate date2 = LocalDate.parse(date2Str);

        if (date1.isBefore(date2)) {
            System.out.println("First date is before second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after second date");
        } else {
            System.out.println("Dates are the same");
        }
    }
}
