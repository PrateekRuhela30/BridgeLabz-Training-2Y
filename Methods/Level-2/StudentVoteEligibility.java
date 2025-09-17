public class StudentVoteEligibility {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        int[] ages = {17, 18, 20, 15, 22, 19, 16, 21, 14, 18};
        for (int age : ages) {
            System.out.println("Age " + age + ": " + canStudentVote(age));
        }
    }
}