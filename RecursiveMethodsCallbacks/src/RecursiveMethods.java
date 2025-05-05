import java.util.Scanner;

public class RecursiveMethods {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number between 1 and 20.");
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println("The result of factorial " + num + " is " + result);
        int result2 = factorial2(num);
        System.out.println("The result of loop factorial " + num + " is " + result2);
        scanner.close();


    }

    //we can also use loops instead

    public static int factorial2(int number){
        int result = 1;
        for (int i = 1; i <=number; i++) {

            result *=i;


        }
        return result;
    }
    //the return 1 act like base case because it helps end the recursion
    public static int factorial(int number){

        if(number == 0){

            return 1;

        }

        return number*factorial(number-1);
    }
}
