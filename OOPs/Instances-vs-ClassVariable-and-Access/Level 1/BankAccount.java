package com.icvm;

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void displayInfo() {
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (via getter): " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
}
