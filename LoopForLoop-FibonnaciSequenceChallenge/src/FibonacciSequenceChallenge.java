import java.util.Scanner;
public class FibonacciSequenceChallenge {
    public static void main(String[] args){
        //fibonacci sequence
        //011235813
        //starts with 0 and 1 and every other number is the sum of the previous two numbers

        Scanner scanner = new Scanner(System.in);

        //Ask user for number of levels
        System.out.print("Please enter number of terms you want: ");
        int number = scanner.nextInt();

        //we already have term 1 and 2

        int term1 = 0;
        int term2 = 1;

        //in case a user puts 1 as the number of terms they want. we handle that since the sequence requires at least 2 numbers.

        if (number==1){
            System.out.println(term1);
        }else{
            System.out.print(term1 + " " + term2);
            //adopt the for loop
            for (int i = 3; i <=number ; i++) {
                int term3 = term1+term2;
                System.out.print(" " + term3);
                term1 = term2; //allows us to continue the loop
                term2 = term3;
            }
        }

        scanner.close();




    }
}
