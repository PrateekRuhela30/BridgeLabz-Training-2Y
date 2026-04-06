import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueRecursion {

    // Function to reverse queue using recursion
    public static void reverseQueue(Queue<Integer> q) {
        // Base case
        if (q.isEmpty()) {
            return;
        }

        // Step 1: Remove front element
        int front = q.poll();

        // Step 2: Recursively reverse remaining queue
        reverseQueue(q);

        // Step 3: Add removed element at rear
        q.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Original Queue: " + q);

        reverseQueue(q);

        System.out.println("Reversed Queue: " + q);
    }
}