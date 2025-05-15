import java.util.Scanner;

public class CodingExercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();


            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
           int result = numerator/denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Cleanup operations
            System.out.println("Division operation complete.");
        }
    }
}
