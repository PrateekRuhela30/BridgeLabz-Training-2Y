package com.gla;

public class PalindromCheckerMain {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("hello");
        checker2.displayResult();

        PalindromeChecker checker3 = new PalindromeChecker("A man a plan a canal Panama");
        checker3.displayResult();
    }
}
