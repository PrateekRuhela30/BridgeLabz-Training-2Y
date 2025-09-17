public class FriendComparison {
    public static String youngest(String[] names, int[] ages) {
        int min = ages[0], index = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < min) { min = ages[i]; index = i; }
        return names[index];
    }

    public static String latest(String[] names, int[] joinDates) {
        int max = joinDates[0], index = 0;
        for (int i = 1; i < joinDates.length; i++) if (joinDates[i] > max) { max = joinDates[i]; index = i; }
        return names[index];
    }

    public static void main(String[] args) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = {25, 22, 24};
        int[] joinDates = {20200101, 20210315, 20201230};
        System.out.println("Youngest: " + youngest(names, ages));
        System.out.println("Latest: " + latest(names, joinDates));
    }
}