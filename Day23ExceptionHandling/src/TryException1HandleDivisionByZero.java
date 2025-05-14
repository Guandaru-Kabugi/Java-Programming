import java.util.InputMismatchException;
import java.util.Scanner;

public class TryException1HandleDivisionByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to divide 10 by: ");

        try {
            int userInput = scanner.nextInt(); //this should be inside the try block
            int result = 10/userInput;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e){
            //handle division by zero error
            System.out.println("Cannot divide a number by Zero.");
        } catch (InputMismatchException e){
            System.out.println("Error. Only enter integers.");
        } catch (Exception e){
            System.out.println("Caught an unexpected error. " + e.getMessage());
        }


    }
}
