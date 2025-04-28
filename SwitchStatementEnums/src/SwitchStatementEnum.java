import java.util.Scanner;
public class SwitchStatementEnum {

    //enum class
    public enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,
        FRIDAY,SATURDAY,SUNDAY
    }
    public enum CoffeeSize{
        SMALL,MEDIUM,LARGE,VENTI
    }
    public static void main(String[] args) {
        //declare and initialize scanner
        Scanner scanner = new Scanner(System.in);

        //get user input
        System.out.println("Select a number between 1 and 7 that represents one of the days of the week (hint: Monday is day 1. ");
        int day = scanner.nextInt();
        String dayName;

        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Input";
                break;
        }
        System.out.println("Today is " + dayName);

        //enums -- enumerations
        //CoffeeSize size = CoffeeSize.LARGE;
        CoffeeSize size = CoffeeSize.LARGE;
        double price;
        switch (size){
            case SMALL:
                price = 2.55;
                break;
            case LARGE:
                price = 3.55;
                break;
            case MEDIUM:
                price = 3.00;
                break;
            case VENTI:
                price = 4.50;
                break;
            default:
                price = 100.00;
                break;
        }
        System.out.printf("The price for your coffee is: $%.2f%n", price); //using printf




        scanner.close();


    }
}
