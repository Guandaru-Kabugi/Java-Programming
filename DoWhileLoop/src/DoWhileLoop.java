import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = 5;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <=10);

        boolean stopPlaying = true;
        do {
            System.out.println("Please enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Please enter second number: ");
            double num2 = scanner.nextDouble();
            double result = num1+num2;
            System.out.println("Here are the results: " + result);
            System.out.println("Please 1 to continue and 2 to stop the loop");
            int choice = scanner.nextInt();
            if(choice==2){
               stopPlaying = false;
                //break;
            } else continue;
        }while(stopPlaying);
    }
}
