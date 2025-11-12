import java.util.*;

public class WrapperPerformanceBenchmark {
    public static void main(String[] args) {
        int size = 1_000_000;

        long startArrayTime = System.nanoTime();
        int[] primitiveArray = new int[size];
        for (int i = 0; i < size; i++) {
            primitiveArray[i] = i;
        }
        long arraySum = 0;
        for (int value : primitiveArray) {
            arraySum += value;
        }
        long endArrayTime = System.nanoTime();

        long startListTime = System.nanoTime();
        ArrayList<Integer> wrapperList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            wrapperList.add(i);
        }
        long listSum = 0;
        for (int value : wrapperList) {
            listSum += value;
        }
        long endListTime = System.nanoTime();

        System.out.println("Primitive array sum: " + arraySum);
        System.out.println("Time taken (int[]): " + (endArrayTime - startArrayTime) / 1_000_000 + " ms");

        System.out.println("Wrapper list sum: " + listSum);
        System.out.println("Time taken (ArrayList<Integer>): " + (endListTime - startListTime) / 1_000_000 + " ms");
    }
}