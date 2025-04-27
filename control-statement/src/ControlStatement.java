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

        //if else control statements

        System.out.println("Enter a number between 2 and 100: " );
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("The number " + num + " is divisible by 2 meaning it is even.");

        } else System.out.println("This number " + num + " is an odd number.");


        //nested if else statement

        if(number<0){
            System.out.println("This number is negative: " + number);
        } else if (number>0) {
            System.out.println("This number is positive: " + number);
        }else System.out.println("This number is 0: " + number);

        //if else if else control

        System.out.println("Please enter your grade between 0 and 100");
        int grade = scanner.nextInt();

        if(grade>=90 && grade<=100){
            System.out.println("Congratulations. Your grade is an A for score: " + grade);
        } else if (grade>=80 && grade <90) {
            System.out.println("Well done. Your grade is a B for score: " + grade);
        } else if (grade>=70 && grade<80) {
            System.out.println("You did good. Your grade is a C for score: " + grade);
        } else if (grade>=60 && grade<70) {
            System.out.println("Keep pushing. Your grade is a D for score: " + grade);
        } else if (grade < 60 && grade >=0) {
            System.out.println("Unfortunately, your grade is an E for score: " + grade);
        } else System.out.println("Please enter a valid score.");

        //ternary operators
        // condition ? expression1 : expression2

        char grade1 = (grade>=90 && grade<=100)? 'A'
                : (grade>=80 && grade <90) ? 'B'
                : (grade>=70 && grade<80) ? 'C'
                : (grade>=60 && grade<70) ? 'D'
                : (grade < 60 && grade >=0) ? 'E'
                : 'F';
        System.out.println("Here is the grade using ternary operator: " + grade1);


        scanner.close();

    }
}
