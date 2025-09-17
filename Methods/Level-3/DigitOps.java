public class DigitOps {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean areEqual(int a, int b) {
        return a == b;
    }

    public static boolean duckFrequency(int n) {
        int[] d = getDigits(n);
        int[] freq = new int[10];
        for (int digit : d) freq[digit]++;
        for (int i = 1; i < 10; i++) if (freq[i] > 1) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 707;
        System.out.println(duckFrequency(n));
    }
}