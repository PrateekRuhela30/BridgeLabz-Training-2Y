public class QuadraticEquationSolver {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (a == 0 || delta < 0) return new double[0];
        if (delta == 0) return new double[]{-b / (2 * a)};
        double sqrtDelta = Math.sqrt(delta);
        double root1 = (-b + sqrtDelta) / (2 * a);
        double root2 = (-b - sqrtDelta) / (2 * a);
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        double a = 1, b = -3, c = 2;
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No real roots");
        else for (double r : roots) System.out.println("Root: " + r);
    }
}