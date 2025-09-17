public class Collinearity {
    public static boolean checkSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int ab = (y2 - y1) * (x3 - x2);
        int bc = (y3 - y2) * (x2 - x1);
        return ab == bc;
    }

    public static boolean checkArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;
        System.out.println(checkSlope(x1, y1, x2, y2, x3, y3));
        System.out.println(checkArea(x1, y1, x2, y2, x3, y3));
    }
}