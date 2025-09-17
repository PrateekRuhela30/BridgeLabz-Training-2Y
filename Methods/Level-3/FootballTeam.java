public class FootballTeam {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int h : arr) s += h;
        return s;
    }

    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int h : arr) if (h > m) m = h;
        return m;
    }

    public static void main(String[] args) {
        int[] team = generateHeights();
        System.out.println("Sum: " + sum(team));
        System.out.println("Mean: " + mean(team));
        System.out.println("Tallest: " + max(team));
    }
}