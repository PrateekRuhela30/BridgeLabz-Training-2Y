interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println(" Default refund of ₹" + amount + " initiated.");
    }
}

class PayFast implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println(" PayFast processed payment of ₹" + amount);
    }
}

class QuickPay implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println(" QuickPay processed payment of ₹" + amount);
    }

    public void refund(double amount) {
        System.out.println(" QuickPay custom refund of ₹" + amount + " completed.");
    }
}

public class PaymentGatewayApp {
    public static void main(String[] args) {
        PaymentProcessor pf = new PayFast();
        PaymentProcessor qp = new QuickPay();

        pf.processPayment(500);
        pf.refund(200);

        qp.processPayment(800);
        qp.refund(300);
    }
}