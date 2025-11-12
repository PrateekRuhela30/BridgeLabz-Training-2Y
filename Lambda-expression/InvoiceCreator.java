import java.util.*;
import java.util.function.Function;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN101", "TXN102", "TXN103");

        Function<String, Invoice> createInvoice = Invoice::new;

        List<Invoice> invoices = transactionIds.stream()
                                               .map(createInvoice)
                                               .toList();

        invoices.forEach(System.out::println);
    }
}