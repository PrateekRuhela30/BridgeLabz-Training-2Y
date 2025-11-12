import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Aditya", 101);
        Faculty f = new Faculty("Dr. Sharma", "Database Systems");

        s.display();
        f.display();
    }
}
