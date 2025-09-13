package com.gla;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Prateek Ruhela", "ACC12345", 5000);

        account.displayBalance();
        account.deposit(2000);
        account.displayBalance();
        account.withdraw(1000);
        account.displayBalance();
        account.withdraw(7000);
    }
}
