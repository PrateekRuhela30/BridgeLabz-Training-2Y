import java.util.*;

public class NGF_UsingQueue {

    public static int[] nextGreaterFrequency(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Step 1: Frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use queue (for demonstration)
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(arr[i]);
        }

        // Step 3: Brute force using queue logic
        for (int i = 0; i < n; i++) {
            result[i] = -1;

            for (int j = i + 1; j < n; j++) {
                if (freq.get(arr[j]) > freq.get(arr[i])) {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3, 2, 1};

        int[] res = nextGreaterFrequency(arr);

        System.out.println("Output:");
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}