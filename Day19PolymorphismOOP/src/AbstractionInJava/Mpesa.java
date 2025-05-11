package AbstractionInJava;

public class Mpesa extends Payment{
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing Mpesa payment of : kshs " + amount);
        confirmPayment();
    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing Mpesa Payment.");

    }
}
