import java.util.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3, 2};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4, 3, null));

        ArrayList<Integer> combinedRatings = new ArrayList<>();
        for (int rating : oldRatings) {
            combinedRatings.add(rating);
        }
        combinedRatings.addAll(newRatings);

        List<Integer> validRatings = combinedRatings.stream()
                .filter(Objects::nonNull)
                .toList();

        double average = validRatings.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average product rating: " + average);
    }
}