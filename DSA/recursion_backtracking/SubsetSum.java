
public class SubsetSum {

    public static void subset(int[] arr, int i, int sum, int target, String set) {
        if (sum == target) {
            System.out.println(set);
            return;
        }

        if (i == arr.length || sum > target) return;

        subset(arr, i+1, sum + arr[i], target, set + arr[i] + " ");
        subset(arr, i+1, sum, target, set);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        subset(arr,0,0,9,"");
    }
}
