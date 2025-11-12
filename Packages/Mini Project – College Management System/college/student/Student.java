package college.student;

public class Student {
    public String name;
    public int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void show() {
        System.out.println("Student: " + name + " (" + roll + ")");
    }
}
