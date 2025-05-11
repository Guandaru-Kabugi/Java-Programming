package AbstractionInJava;

public abstract class Payment {
    abstract void processPayment(double amount); //no body
    abstract void initializeTransaction(); //not giving specifications on the 'how'
    //concrete methods
     void confirmPayment(){
         System.out.println("Payment confirmed!"); //complete code

     }

}
