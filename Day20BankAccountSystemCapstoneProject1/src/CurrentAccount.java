public class CurrentAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        double balance = getBalance()-amount;
        if(balance>=-500){
            setBalance(balance);
            System.out.println("Withdrawal from Current Account successful.");
        }else{
            System.out.println("Insufficient funds. Minimum balance of $100 required.");
        }
    }
}
