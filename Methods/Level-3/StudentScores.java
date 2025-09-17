public class StudentScores {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 30 + (int)(Math.random() * 71);
            scores[i][1] = 30 + (int)(Math.random() * 71);
            scores[i][2] = 30 + (int)(Math.random() * 71);
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    public static void display(int[][] scores, double[][] stats) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + " ∇ " + scores[i][1] + " ∇ " + scores[i][2] + " ∇ " +
                               stats[i][0] + " ∇ " + stats[i][1] + " ∇ " + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] stats = calculateStats(scores);
        display(scores, stats);
    }
}