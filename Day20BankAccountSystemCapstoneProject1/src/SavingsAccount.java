public class SavingsAccount extends BankAccount{
    @Override
    public void withdraw(double amount) {
        double balance = getBalance()-amount;
        if(balance>=100){
            setBalance(balance);
            System.out.println("Withdrawal successful.");
        }else{
            System.out.println("Insufficient funds. Minimum balance of $100 required.");
        }
    }
}
