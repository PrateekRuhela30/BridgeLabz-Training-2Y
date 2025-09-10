import java.util.Random;
import java.util.Scanner;

public class StudentMarksGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] totalsAvgsPercents = calculateTotalsAvgsPercents(scores);
        String[][] grades = calculateGrades(totalsAvgsPercents);
        displayScorecard(scores, totalsAvgsPercents, grades);
    }

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10; // 10-99
            }
        }
        return scores;
    }

    public static double[][] calculateTotalsAvgsPercents(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, avg, percent
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = (double)total / 3;
            double percent = (double)total / 300 * 100;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static String[][] calculateGrades(double[][] totalsAvgsPercents) {
        String[][] grades = new String[totalsAvgsPercents.length][1];
        for (int i = 0; i < totalsAvgsPercents.length; i++) {
            double percent = totalsAvgsPercents[i][2];
            if (percent >= 90) {
                grades[i][0] = "A";
            } else if (percent >= 80) {
                grades[i][0] = "B";
            } else if (percent >= 70) {
                grades[i][0] = "C";
            } else if (percent >= 60) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] totalsAvgsPercents, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t" + totalsAvgsPercents[i][0] + "\t" + totalsAvgsPercents[i][1] + "\t" + totalsAvgsPercents[i][2] + "\t\t" + grades[i][0]);
        }
    }
}
