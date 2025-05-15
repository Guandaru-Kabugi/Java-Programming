public class BankClass {
    private double balance;

    //constructor
    public BankClass(double balance){
        this.balance = balance;
    }

    //method to withdraw money from account

    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount > balance){
            //throw the custom exception
            throw new InsufficientFundsException("Insufficient balance. your balance is " + balance);
        }
        balance -=amount;
        System.out.println("Withdrawal successful! New Balance: " + balance);
    }
    public void deposit(double amount){
        balance +=amount;
        System.out.println("Deposit successful. New Balance is " + balance);
    }

    //getter for balance

    public double getBalance() {
        return balance;
    }
}
