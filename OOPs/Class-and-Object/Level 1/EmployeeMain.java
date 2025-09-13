package com.gla;

public class EmployeeMain {
    public static void main(String[] args){
        Employee emp1 = new Employee("Prateek", 101, 50000000);

        emp1.employeeDetails();
        System.out.println(emp1.toString());
    }
}
