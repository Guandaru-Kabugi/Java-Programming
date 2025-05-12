
public class Main {
    public static void main(String[] args){
        boolean continueRunning = true; //to stop the loop
        BankService service = new BankService();
        while(continueRunning){
            InputUtils.menu(); //we display the menu
            int choice = InputUtils.getInt("Please select your preferred option.");
            switch (choice){
                case 1:
                    String accountName = InputUtils.getString("Please enter your account name");
                    String accountNumber = InputUtils.getString("Please enter your chosen account number");
                    service.setSavingAccount(accountName,accountNumber);
                    break;
                case 2:
                    String accountName1 = InputUtils.getString("Please enter your account name");
                    String accountNumber1 = InputUtils.getString("Please enter your chosen account number");
                    service.setCurrentAccount(accountName1,accountNumber1);
                    break;
                case 3:
                    String accountNumberToDeposit = InputUtils.getString("Please enter your account number");
                    double amountToBeDeposited = InputUtils.getDouble("Please the amount you are depositing");
                    service.depositMoney(accountNumberToDeposit,amountToBeDeposited);
                    break;
                case 4:
                    String accountNumberToWithdraw = InputUtils.getString("Please enter your account number");
                    double amountToBeWithdrawn = InputUtils.getDouble("Please the amount you are depositing");
                    service.withdrawalMethod(accountNumberToWithdraw,amountToBeWithdrawn);
                    break;
                case 5:
                    String accountNumberToViewBalance = InputUtils.getString("Please enter your account number");
                    service.showBalance(accountNumberToViewBalance);
                    break;
                case 6:
                    System.out.println("Goodbye. See you soon.");
                    continueRunning = false;
                    break;
                default:
                    System.out.println("You selected the wrong choice. Pick from the list.");
                    break;
            }
            System.out.println(BankAccount.getNumberOfClients());
        }
    }
}
