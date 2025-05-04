import java.util.Random;
import java.util.Scanner;

public class MethodsUses {
    public static void main(String[] args){

        for (int i = 0; i < 5; i++) {
            sayHello();
        }
        sayName("James",20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of slices of cheese you want to use.");
        makeSandwich(scanner.nextInt());

        //pass by value

        int num = 4;
        System.out.println("The number before method is called. " + num);
        passByValue(num);
        System.out.println("The number after method is called. " + num);


        //pass by reference

        int[] originalArray = {1,2,3,4};
        System.out.println("The before method is called value at index originalArray[0] is " + originalArray[0]);

        passByReference(originalArray);
        System.out.println("The after method is called value at index originalArray[0] is " + originalArray[0]);

        //method calling that returns a value
        //addition
        System.out.println("Enter the first whole number. ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second whole number. ");
        int number2 = scanner.nextInt();


        int result = sumOfNumber(number1,number2);
        System.out.println("The result of the sum is: " + result);

        //subtraction

        System.out.println("Enter the first whole number. ");
        int number3 = scanner.nextInt();
        System.out.println("Enter the second whole number. ");
        int number4 = scanner.nextInt();


        int result1 = subtractionOfNumbers(number3,number4);
        System.out.println("The result of the subtraction is: " + result1);


        //Generating random numbers
        Random random = new Random();
        int randomNumber = random.nextInt();
        int randomNumber2 = random.nextInt(10);
        int randomNumber3 = random.nextInt(10,20);
        System.out.println("The random number is: " + randomNumber2);



        scanner.close();



    }
    //no parameters
    public static void sayHello(){  //we have to add the word static before void to call method inside a static main
        System.out.println("Hello World. First void method");
        sayWelcome();
    }
    public static void sayWelcome(){  //we have to add the word static before void to call method inside a static main
        System.out.println("welcome");
    }
    //with parameters

    public static void sayName(String name, int age){
        System.out.println("Hello " + name + ". You are " + age + " years old.");
    }

    public static void makeSandwich(int slicesOfCheese){
        System.out.println("Take two slices of bread.");
        System.out.println("Spread butter on one slice.");
        for (int i = 1; i < slicesOfCheese+1; i++) {
            System.out.println("Add slice " + i + " of cheese.");
        }

        System.out.println("put the second slice of bread on top.");
        System.out.println("Sandwich is ready.");

    }

    //pass by value vs pass by reference
    //pass by value is for primitive data types e.g. string,int,boolean,double
    //pass by reference is for more complex data types e.g. arrays,objects.

    //pass by value method for int
    public static void passByValue(int number){
        number = 10;
        System.out.println("Inside method result. " + number);
    }

    //pass by reference method for array
    public static void passByReference(int[] array){
        array[0] = 4;
        System.out.println("The inside method value at index array[0] is " + array[0]);
    }

    // methods that return a value

    public static int sumOfNumber(int num1, int num2){
        return num1+num2;
    }
    public static int subtractionOfNumbers(int num1, int num2){
        return num1-num2;
    }



}
