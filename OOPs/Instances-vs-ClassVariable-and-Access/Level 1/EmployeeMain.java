package com.icvm;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "Sales", 75000.0, 5);
        manager.displayInfo();
        manager.setSalary(80000.0);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
