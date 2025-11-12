import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] rawMarks = {"85", 95, Integer.valueOf(88), "null", null, "abc", 72};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object mark : rawMarks) {
            if (mark instanceof Integer) {
                validMarks.add((Integer) mark);
            } else if (mark instanceof String) {
                try {
                    int parsed = Integer.parseInt((String) mark);
                    validMarks.add(parsed);
                } catch (NumberFormatException e) {
                    // ignore invalid strings
                }
            }
        }

        double average = validMarks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average student mark: " + average);
    }
}