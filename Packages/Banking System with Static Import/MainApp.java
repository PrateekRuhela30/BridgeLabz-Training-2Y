import com.bank.util.InterestCalculator;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Simple Interest: " + InterestCalculator.calculateSimpleInterest(10000, 5, 2));
        System.out.println("Compound Interest: " + InterestCalculator.calculateCompoundInterest(10000, 5, 2));
    }
}
