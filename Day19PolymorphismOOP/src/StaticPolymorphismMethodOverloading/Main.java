package StaticPolymorphismMethodOverloading;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(5,10); //compiler determines the method used
        System.out.println("Sum of two integers: " + sum1);

        double sum2 = calculator.add(5.3,10.5); //compiler determines the method used
        System.out.println("Sum of two doubles: " + sum2);

        int sum3 = calculator.add(5,10,20); //compiler determines the method used
        System.out.println("Sum of three integers: " + sum3);

        //complier determines which method from the overload to use.

    }
}
