public abstract class BankAccount {
    private String accountNumber;
    private double balance =0;
    private String accountHolderName;
    private static int numberOfClients =0;

    //constructor
    public BankAccount(){
        numberOfClients++; //we add an employee after its created
    }

    public static void setNumberOfClients(int numberOfClients) {
        BankAccount.numberOfClients+= numberOfClients;
    }
    //set accountNumber safely

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    //set account name safely

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    //getter method to return account number
    public String getAccountNumber() {
        return accountNumber;
    }
    //getter method to return the account holder name

    public String getAccountHolderName() {
        return accountHolderName;
    }
    //a way to adjust the balance

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //returns the balance for the client

    public double getBalance() {
        return balance;
    }

    //validate accountNumber to ensure uniqueness.
    // Simplifies how a database would handle it.
    //since no database is being saved, we won't need the uniqueness. maybe length
    private void isAccountNumberValidLength(String accountNumber){
        //we use an if statement
        if(accountNumber.length() == 10){
            this.accountNumber = accountNumber;
            System.out.println("The Account Number has been created successfully.");
        }else{
            System.out.println("The account number must be 10 characters.");
        }
    }
    //method to increase the balance
    public void deposit(double amount){
        this.balance+=amount;
    }
    //get number of new clients in the bank
    public static int getNumberOfClients() {
        return numberOfClients;
    }
    //abstract method for withdrawing money
    public abstract void withdraw(double amount);
    }


