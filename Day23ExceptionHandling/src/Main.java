import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankClass account = new BankClass(500.00);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("\nWelcome to the Bank Account Manager.");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Please select an option:");

            int choice = scanner.nextInt();

            try{
                switch (choice){
                    case 1:
                        System.out.println("Enter the amount to deposit:");
                        double depositAmount = scanner.nextDouble();
                        account.deposit((depositAmount));
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Current balance: " + account.getBalance());
                        break;
                    case 4:
                        exit = true;
                        System.out.println(("Thank you for using the Bank Account Manager"));
                        break;
                    case 5:
                        System.out.println("Invalid Choice. Please try again. ");
                        break;
                }
            }catch (InsufficientFundsException e){
                //handle the custom exception
                System.out.println("Exception caught: " + e.getMessage());
            }catch (Exception e){
                //handle any other exception
                System.out.println("Another error occurred: " + e.getMessage());
            }
            finally {
                System.out.println("We close the program"); //best practice. always close the scanner.
            }
        }
        scanner.close();


    }
}
