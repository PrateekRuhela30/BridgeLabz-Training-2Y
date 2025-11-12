package com.company.payroll;

import com.company.hr.Employee;

public class Payroll {
    public double calculateBonus(Employee e) {
        return e.getSalary() * 1.10; // 10% bonus
    }
}
