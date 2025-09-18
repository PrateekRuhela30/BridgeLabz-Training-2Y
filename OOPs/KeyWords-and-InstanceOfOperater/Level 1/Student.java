public class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    private final String rollNumber;
    private String name;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Charlie", "R001", "A");
        student1.displayStudentDetails();
        Student.displayTotalStudents();
    }
}
