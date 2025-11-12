import java.util.*;

public class EmployeeAgeProcessor {
    public static void main(String[] args) {
        int[] ageArray = {28, 35, 42, 23, 31, 45};

        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ageArray) {
            ageList.add(Integer.valueOf(age));
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest employee age: " + youngest);
        System.out.println("Oldest employee age: " + oldest);
    }
}