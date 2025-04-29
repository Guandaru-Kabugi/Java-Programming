import java.util.Scanner;

public class AdvancedCalculatorChallenge {
    public static void main(String[] args){

        //initialize the scanner
        Scanner scanner = new Scanner(System.in);
        String continueCalculator;
        boolean continuePlaying = true;
        double result;

        // Infinite loop to keep the calculator running until the user decides to quit
        while (continuePlaying){
            // Prompt the user to enter two numbers
            System.out.println("Please enter the first number. ");
            double firstNumber = scanner.nextDouble();
            System.out.println("Please enter the second number. ");
            double secondNumber = scanner.nextDouble();
            scanner.nextLine();
            // Prompt the user to choose an operation
            System.out.println("Please choose a sign: + - / *: ");
            String operator = scanner.nextLine();
            if (operator.equals("+")){
                result = firstNumber + secondNumber;
                System.out.println("The result of the addition of first and second number is: " + result);
            } else if (operator.equals("-")) {
                result = firstNumber - secondNumber;
                System.out.println("The result of the subtraction of first and second number is: " + result);
            } else if (operator.equals("*")) {
                result = firstNumber * secondNumber;
                System.out.println("The result of the multiplication of first and second number is: " + result);
            } else if (operator.equals("/")) {
                if (secondNumber ==0){
                    System.out.println("A number cannot be divided by zero");
                }else {
                    result = firstNumber/secondNumber;
                    System.out.println("The result of the division of first and second number is: " + result);
                }
            }
            System.out.println("Do you want to perform another calculation? yes to continue and stop to end the loop ");
            continueCalculator = scanner.nextLine();
            if (continueCalculator.equalsIgnoreCase("stop")){
                continuePlaying = false;
            } else continue;



        }

        // End the program
        System.out.println("Calculator session ended. Goodbye!");
        scanner.close();
    }
}
