import java.util.Scanner;
public class NoChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(num>0){
            System.out.println("Number is Positive: " + num);
        }
        else if(num == 0){
            System.out.println("Number is 0: " + num);
        }
        else if(num<0){
            System.out.println("Number is negative: " + num);
        }
    }
}