package com.gla;

public class StudentReport {
    String name;
    int rollNumber;
    int marks;

    public StudentReport(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void grade() {
        if(marks>=90) System.out.println("A+");
        else if(marks>=80) System.out.println("A");
        else if(marks>=70) System.out.println("B+");
        else if(marks>=60) System.out.println("B");
    }
    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        grade();
    }
    public static void main(String[] args){
    StudentReport std = new StudentReport("Prateek",40,90);
    std.show();
    }
}

