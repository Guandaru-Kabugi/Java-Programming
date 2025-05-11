package AbstractionInJava;

public class PayPalPayment extends Payment{
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing PayPal payment of: $" + amount);
        confirmPayment();

    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing PayPal transaction and connecting to PayPal API");

    }
}
