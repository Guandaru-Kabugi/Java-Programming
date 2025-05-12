import java.util.Scanner;

public class InputUtils {
    //ensures it is applicable to all classes
    public static final Scanner scanner = new Scanner(System.in);


    public static String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
    public static Double getDouble(String prompt){
        System.out.println(prompt);
        double value = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline
        return value;


    }
    public static int getInt(String prompt){
        System.out.println(prompt);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    public static void menu(){
        System.out.println("1. Create A Savings Account");
        System.out.println("2. Create A Current Account");
        System.out.println("3. Deposit Money");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Check Balance");
        System.out.println("6. Exit");
    }
}
