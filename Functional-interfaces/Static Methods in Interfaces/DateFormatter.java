import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatter {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

class InvoiceGenerator {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        String format1 = DateFormatter.formatDate(today, "dd-MM-yyyy");
        String format2 = DateFormatter.formatDate(today, "MMMM dd, yyyy");
        String format3 = DateFormatter.formatDate(today, "yyyy/MM/dd");

        System.out.println("Invoice Date (Format 1): " + format1);
        System.out.println("Invoice Date (Format 2): " + format2);
        System.out.println("Invoice Date (Format 3): " + format3);
    }
}