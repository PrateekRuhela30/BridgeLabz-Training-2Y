import java.util.Scanner;

public class CylinderVolumeCalculator {
    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = calculateVolume(radius, height);
        System.out.println("Volume of cylinder: " + volume);
    }
}