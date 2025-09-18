public class BankAccount {
    private static String bankName = "State bank of India";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "123456789");
        BankAccount account2 = new BankAccount("Jane Smith", "987654321");

        account1.displayDetails();
        account2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
