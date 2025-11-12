import java.util.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ageArray = {32, 45, 28, 39, 50, 26, 41};
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