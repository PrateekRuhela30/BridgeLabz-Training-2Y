package com.icvm;

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123456", "John Doe", 1500.0, 3.5);
        sa.displayInfo();
        sa.setBalance(2000.0);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
