package college.main;

import static java.lang.System.out;
import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Riya", 201);
        Faculty f = new Faculty("Dr. Mehta", "Java");
        Department d = new Department("Computer Science");

        out.println("=== College Info ===");
        s.show();
        f.show();
        d.show();
    }
}
