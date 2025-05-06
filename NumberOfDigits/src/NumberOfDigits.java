import java.util.Arrays;
import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args){
        //declare scanner
        Scanner scanner = new Scanner(System.in);
        //take a number from user
        System.out.println("Please enter a whole number of your choice: ");
        int response = scanner.nextInt();
        scanner.nextLine();
        //return an answer with the number of digits
        int numberOfDigits = numberOfDigits(response);
        System.out.println("The number of digits in " + response + " is " + numberOfDigits);
    }
    public static int numberOfDigits(int num){
        //base case. it means that from 0 to 9, there is only 1 digit
        if(num<10){
           return 1;
        }
        else return 1 + numberOfDigits(num/10); //example if number is 100, 100/10 is 10, then 10/10 is 1 and recursion ends with 3 digits
    }


}
