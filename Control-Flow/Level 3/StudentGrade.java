import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();
        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;
        System.out.println("Average Mark: " + (total / 3));
        String grade;
        String remarks;
        if (percentage >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "D";
            remarks = "Satisfactory";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
