import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args){

        //simple if statement

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random number either positive or negative: ");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("You entered a positive number.");

        } System.out.println("This is outside the if condition!!");


        //nested if statement

        if(number>0){
            if(number<10){
                System.out.println("This number is between 0 and 10: " + number);

            }System.out.println("This is printed after the nested loop ends.");
        }

        //logical operators

        if((number>0) && (number<10)){
            System.out.println("This number is between 0 and 10 using logical operators: " + number);

        }System.out.println("This is the end of the logical operator if statement");

        scanner.close();

    }
}
