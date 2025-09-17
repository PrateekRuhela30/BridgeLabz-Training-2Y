public class DigitAnalysis {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int sumDigits(int[] d) {
        int s = 0;
        for (int digit : d) s += digit;
        return s;
    }

    public static int sumSquares(int[] d) {
        int s = 0;
        for (int digit : d) s += digit * digit;
        return s;
    }

    public static boolean isHarshad(int n) {
        int[] d = getDigits(n);
        return n % sumDigits(d) == 0;
    }

    public static int[][] harshadFrequency(int[] nums) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int n : nums) {
            if (isHarshad(n)) {
                int[] d = getDigits(n);
                for (int digit : d) freq[digit][1]++;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] nums = {18, 21, 12, 30};
        int[][] freq = harshadFrequency(nums);
        for (int[] row : freq) System.out.println(row[0] + " " + row[1]);
    }
}