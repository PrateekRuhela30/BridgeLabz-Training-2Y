public class NumberChecker7 {
    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static boolean isPronic(int n) {
        for (int i = 0; i <= n; i++) if (i * (i + 1) == n) return true;
        return false;
    }

    public static boolean isSunny(int n) {
        int x = n + 1;
        int sqrt = (int)Math.sqrt(x);
        return sqrt * sqrt == x;
    }

    public static boolean isSquare(int n) {
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static boolean isTrimorphic(int n) {
        int cube = n * n * n;
        return String.valueOf(cube).endsWith(String.valueOf(n));
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.println(isHappy(n));
        System.out.println(isPronic(n));
        System.out.println(isSunny(n));
        System.out.println(isSquare(n));
        System.out.println(isTrimorphic(n));
    }
}