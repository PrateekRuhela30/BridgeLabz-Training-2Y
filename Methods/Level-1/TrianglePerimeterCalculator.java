import java.util.Scanner;

public class TrianglePerimeterCalculator {
    public static int calculatePerimeter(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int perimeter = calculatePerimeter(side1, side2, side3);
        System.out.println("Perimeter of triangle: " + perimeter);
    }
}