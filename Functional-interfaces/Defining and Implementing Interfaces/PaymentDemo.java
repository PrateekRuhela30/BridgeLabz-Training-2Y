public interface PaymentMethod {
    void pay(double amount);
}


public class UPI implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}


public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}


public class Wallet implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " from Wallet.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod upi = new UPI();
        PaymentMethod card = new CreditCard();
        PaymentMethod wallet = new Wallet();

        upi.pay(250.0);
        card.pay(1200.5);
        wallet.pay(500.75);
    }
}
