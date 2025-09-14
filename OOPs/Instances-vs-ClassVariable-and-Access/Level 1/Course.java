package com.icvm;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}