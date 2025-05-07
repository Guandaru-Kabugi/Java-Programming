import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){

        //initialize scanner
        Scanner scanner = new Scanner(System.in);

        //welcome user and give instructions
        System.out.println("Welcome to this guessing game. ");
        System.out.println("Think of a number between 1 and 100, including 100 itself. ");
        System.out.println("Let the computer guess. Guide it by telling it whether the guess is higher, lower than your number or correct ");
        System.out.println("'h' is if computer guess is higher than your number. ");
        System.out.println("'l' is if computer guess is lower than your number. ");
        System.out.println("'c' is if computer guess is correct. ");

        int low = 1;
        int high = 100;

        boolean answer = false;
        //for char we do char feedback = scanner.next().charAt(0)

        while(!answer){

            int guess = low + (high-low)/2; //mid point
            System.out.println("The computer guess is " + guess);
            System.out.println("Give feedback to the computer. Type 'h', 'l' or 'c'");
            String answer1 = scanner.nextLine();
            if(answer1.equalsIgnoreCase("c")){
                System.out.println("The guess is correct and the number is " + guess);
                answer = true;
            }
            else if(answer1.equalsIgnoreCase("h")){
                low = guess +1;
            } else if (answer1.equalsIgnoreCase("l")) {
                high = guess -1;
            } else {
                System.out.println("You entered a wrong response. only h, c, or l.");
            }
        }
        scanner.close();

    }
}
