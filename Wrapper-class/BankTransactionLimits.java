public class BankTransactionLimits {
    public static double getRemainingLimit(Double limit) {
        return (limit != null) ? limit : 0.0;
    }

    public static void main(String[] args) {
        Double newAccountLimit = 5000.0;
        Double oldAccountLimit = null;

        System.out.println("New account limit: " + getRemainingLimit(newAccountLimit));
        System.out.println("Old account limit: " + getRemainingLimit(oldAccountLimit));
    }
}