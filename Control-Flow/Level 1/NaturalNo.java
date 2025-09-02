
import java.util.Scanner;

public class NaturalNo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

        int sum=0;
        if(num>0){
            sum=(num*(num+1))/2;
        }
        System.out.println("Sum of n natural No: " + sum);
    }
}