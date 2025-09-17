public class NumberChecker6 {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.contains("0") && s.charAt(0) != '0';
    }

    public static boolean isHarshad(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return n % sum == 0;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    public static void main(String[] args) {
        int n = 18;
        System.out.println(isPerfect(n));
        System.out.println(isPalindrome(n));
        System.out.println(isDuck(n));
        System.out.println(isHarshad(n));
        System.out.println(isDeficient(n));
    }
}