public class InsufficientFundsException extends Exception {
    //constructor

    public InsufficientFundsException(String message){
        super(message);
        System.out.println("Insufficient funds exception was caused.");
    }
}
