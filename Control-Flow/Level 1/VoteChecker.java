import java.util.Scanner;
public class VoteChecker{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = sc.nextInt();

        if(sum>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
    }
}