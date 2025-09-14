package com.icvm;

public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        }
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String researchTopic) {
        super(rollNumber, name, cgpa);
        this.researchTopic = researchTopic;
    }

    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name (protected): " + name);
        System.out.println("CGPA: " + getCgpa());
        System.out.println("Research Topic: " + researchTopic);
    }
}
