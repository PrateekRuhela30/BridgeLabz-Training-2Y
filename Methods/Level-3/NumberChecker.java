public class NumberChecker {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isDuck(int n) {
        int[] d = getDigits(n);
        for (int i = 1; i < d.length; i++) if (d[i] == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] d = getDigits(n);
        int sum = 0;
        for (int digit : d) sum += Math.pow(digit, d.length);
        return sum == n;
    }

    public static boolean isCubeSum(int n) {
        int[] d = getDigits(n);
        int sum = 0;
        for (int digit : d) sum += digit * digit * digit;
        return sum == n;
    }

    public static int maxDigit(int[] d) {
        int max = Integer.MIN_VALUE;
        for (int digit : d) if (digit > max) max = digit;
        return max;
    }

    public static int minDigit(int[] d) {
        int min = Integer.MAX_VALUE;
        for (int digit : d) if (digit < min) min = digit;
        return min;
    }

    public static void main(String[] args) {
        int n = 153;
        int[] d = getDigits(n);
        System.out.println(isDuck(n));
        System.out.println(isArmstrong(n));
        System.out.println(isCubeSum(n));
        System.out.println(maxDigit(d));
        System.out.println(minDigit(d));
    }
}