package com.gla;

public class Student {
    int rollNo;
    String name;
    int phoneNo;
    String email;
    String department;
    public void sayHello(){
        System.out.println("Hello");
    }
    public Student() {
        System.out.println("Inside non-parametrised constructor");
    }
    public Student(int rollNo, String name, int phoneNo, String email, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.department = department;
        System.out.println("Inside parametrised constructor");
    }
    public Student (Student s){
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.email = s.email;
        this.phoneNo = s.phoneNo;
        this.department = s.department;
    }


    @Override
    public String toString() {
        return "Student{" +
                " RollNo=" + rollNo +
                ", Name='" + name + '\'' +
                ", PhoneNo=" + phoneNo +
                ", Email='" + email + '\'' +
                ", Department='" + department + '\'' +
                '}';
    }
}
