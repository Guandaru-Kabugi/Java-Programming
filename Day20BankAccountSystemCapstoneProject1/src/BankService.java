import java.util.ArrayList;
import java.util.Scanner;

public class BankService {
    //variables
    private final ArrayList<BankAccount> savingAccount = new ArrayList<>();
    private final ArrayList<BankAccount> currentAccount = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);


    //Create a savings account
    public void setSavingAccount(String accountName,String accountNumber) {
        //instantiate a savings object
        BankAccount newSavingAccount = new SavingsAccount();
        newSavingAccount.setAccountHolderName(accountName);
        newSavingAccount.setAccountNumber(accountNumber);
        savingAccount.add(newSavingAccount); //we are saving the object
        System.out.println("Savings Account Created Successfully.");
    }
    //create a currentAccount
    public void setCurrentAccount(String accountName,String accountNumber) {
        //instantiate a savings object
        BankAccount newCurrentAccount = new CurrentAccount();
        newCurrentAccount.setAccountHolderName(accountName);
        newCurrentAccount.setAccountNumber(accountNumber);
        currentAccount.add(newCurrentAccount); //we are saving the object
        System.out.println("Current Account Created Successfully.");
    }
    //Perform Deposits

    public void depositMoney(String accountNumber,double amount){
        System.out.println("Please select 1 to deposit to Savings Account and 2 to deposit to Current Account");
        int choice = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        if(choice==1){
            //we are depositing into savings account
            //we need to loop through the arraylist
            for (BankAccount account: savingAccount){
                if(account.getAccountNumber().equals(accountNumber)){
                    account.deposit(amount);
                    System.out.println("Deposit Successfully Done.");
                    found = true;
                    break;
                }
            }

        } else if (choice==2) {
            //we are depositing into current account
            //we loop
            for (BankAccount account: currentAccount){
                if(account.getAccountNumber().equals(accountNumber)){
                    account.deposit(amount);
                    System.out.println("Deposit Successfully Done.");
                    found = true;
                    break;
                }

            }
        }else{
            System.out.println("Please pick 1 or 2.");
        }
        //inform them that account is not found.
        if(!found){
            System.out.println("Account number not found.");
        }
    }
    //Perform Withdrawals
    public void withdrawalMethod(String accountNumber,double amount){
        System.out.println("Please select 1 to withdraw from Savings Account and 2 to withdraw from Current Account");
        int choice = scanner.nextInt();
        scanner.nextLine();
        //realized that the loop will print account number every time it does not match. hence I added the boolean variable
        boolean found = false;
        //we can either withdraw from savings or current account
        if (choice==1){
            //we first loop
            for (BankAccount account: savingAccount){
                if(account.getAccountNumber().equals(accountNumber)){
                    account.withdraw(amount);
                    found = true;
                    break;
                }
            }

        } else if (choice==2) {
            //we first loop
            for (BankAccount account: currentAccount){
                if(account.getAccountNumber().equals(accountNumber)){
                    account.withdraw(amount);
                }
            }

        }else{
            System.out.println("Please pick option 1 or 2.");
        }
        //we are looping first until we complete before saying whether the account is found or not.
        if(!found){
            System.out.println("Account number not found.");
            }

    }
    //Show Balances
    //two accounts
    public void showBalance(String accountNumber){
        System.out.println("Please select 1 to view balance for Savings Account and 2 to view balance for Current Account");
        int choice = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        if(choice == 1){
            for (BankAccount account: savingAccount){
                if(account.getAccountNumber().equals(accountNumber)){
                    System.out.println("Your Savings Account balance is: ");
                    System.out.println(account.getBalance());
                    found = true;
                    break;
                }
            }
        } else if (choice==2) {
            for (BankAccount account: currentAccount){
                if(account.getAccountNumber().equals(accountNumber)){
                    System.out.println("You Current Account balance is: ");
                    System.out.println(account.getBalance());
                    found = true;
                    break;
                }
            }
        }else{
            System.out.println("Please pick option 1 or 2.");
        }
        if(!found){
           System.out.println("Account not found.");
        }
    }

}
