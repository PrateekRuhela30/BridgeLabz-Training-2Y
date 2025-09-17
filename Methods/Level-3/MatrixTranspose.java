public class MatrixTranspose {
    public static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = 1 + (int)(Math.random() * 9);
        return m;
    }

    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    public static void main(String[] args) {
        int[][] m = createMatrix(3, 2);
        int[][] t = transpose(m);
    }