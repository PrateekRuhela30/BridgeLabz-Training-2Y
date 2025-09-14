package com.icvm;

public class CourseMain {
    public static void main(String[] args) {
        Course.updateInstituteName("Global Tech Academy");

        Course c1 = new Course("Java Programming", 40, 500);
        Course c2 = new Course("Data Science", 60, 700);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
