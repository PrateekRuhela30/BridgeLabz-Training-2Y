import java.util.*;

public class DistinctMaxSubarrays {

    public static int countDistinctMax(int[] arr) {
        int n = arr.length;

        // Store unique max values
        HashSet<Integer> set = new HashSet<>();

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            int max = arr[i];

            for (int j = i; j < n; j++) {
                // Update max for current subarray
                max = Math.max(max, arr[j]);

                // Add max to set
                set.add(max);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2};

        int result = countDistinctMax(arr);
        System.out.println("Distinct max elements count: " + result);
    }
}
