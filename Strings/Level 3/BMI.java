import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] heightWeight = new double[10][2]; // 0: weight, 1: height cm

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            heightWeight[i][1] = sc.nextDouble();
        }

        String[][] bmiData = getBMIData(heightWeight);
        displayTable(bmiData);
    }

    public static String[][] getBMIData(double[][] heightWeight) {
        String[][] result = new String[10][4]; // height, weight, bmi, status
        for (int i = 0; i < 10; i++) {
            double weight = heightWeight[i][0];
            double heightCm = heightWeight[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            String status = getStatus(bmi);

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void displayTable(String[][] data) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "\t\t" + data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }
}
