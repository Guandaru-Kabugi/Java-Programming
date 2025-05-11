package AbstractionInJava;

public class CreditCardPayment extends Payment{

    //accessing the declared abstract methods
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing credit card payment payment of: $" + amount);
        confirmPayment();
    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing Credit Card Payment.");
    }
}
