package com.icvm;

public class StudentMain {
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Prateek", 8.7, "Machine Learning");
        pgStudent.displayInfo();
        pgStudent.setCgpa(9.2);
        System.out.println("Updated CGPA: " + pgStudent.getCgpa());
    }
}
