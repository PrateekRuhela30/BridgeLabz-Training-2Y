public class EmployeeBonus {
    public static int[][] generateData() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }

    public static int[][] calculateBonus(int[][] data) {
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            int bonus = data[i][1] > 5 ? (int)(data[i][0] * 0.3) : (int)(data[i][0] * 0.2);
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void display(int[][] oldData, int[][] newData) {
        int oldSum = 0, newSum = 0;
        for (int i = 0; i < 10; i++) {
            oldSum += oldData[i][0];
            newSum += newData[i][0];
            System.out.println(oldData[i][0] + " " + oldData[i][1] + " " + newData[i][0] + " " + newData[i][1]);
        }
        System.out.println("Old Total: " + oldSum);
        System.out.println("New Total: " + newSum);
    }

    public static void main(String[] args) {
        int[][] data = generateData();
        int[][] updated = calculateBonus(data);
        display(data, updated);
    }
}