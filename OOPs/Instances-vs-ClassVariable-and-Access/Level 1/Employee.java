package com.icvm;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayInfo() {
        System.out.println("Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (via getter): " + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}
