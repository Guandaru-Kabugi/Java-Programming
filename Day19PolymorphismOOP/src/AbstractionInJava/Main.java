package AbstractionInJava;

public class Main {
    public static void main(String[] args){

        Payment crediCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();
        Payment mPesaPayment = new Mpesa();

        crediCardPayment.processPayment(100.00);
        payPalPayment.processPayment(100.00);
        mPesaPayment.processPayment(1000.00);

    }

}
