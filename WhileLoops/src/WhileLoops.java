import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args){
        //INITIALIZE SCANNER
        Scanner scanner = new Scanner(System.in);
        //We need a simple add calculator
        boolean proceed = true;

        while (proceed){

            System.out.println("Please enter the first number: ");
            double number1 = scanner.nextDouble();
            System.out.println("Please enter the second number: ");
            double number2 = scanner.nextDouble();

            double result = number1 + number2;
            System.out.println("The result of the sum is: " + result);

            System.out.println("Please 1 to continue and 2 to end loop: ");
            int status = scanner.nextInt();
            if (status==2){
                proceed = false;
            } else{
                continue;
            }
        }

        scanner.close();


    }
}
