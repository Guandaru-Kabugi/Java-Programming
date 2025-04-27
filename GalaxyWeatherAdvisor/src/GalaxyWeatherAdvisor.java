import java.util.Scanner;
public class GalaxyWeatherAdvisor {
    public static void main(String[] args){
        // Step 1: Declare and initialize Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Display a welcome message
        System.out.println("Welcome to the Galactic Weather Advisor!");
        System.out.println("Please enter the planet you are on (Earth, Mars, Venus, Jupiter):");

        // Step 3: Take user input for planet and convert to lowercase
        String planet = scanner.nextLine().toLowerCase();
        // Step 4: Take current temperature as input
        System.out.println("Please enter the current temperature in Celsius:");
        double temperature = scanner.nextDouble();
        // Step 5: Declare a variable to store response
        //String advice;

        // Step 6: Compute response based on planet and temperature
        if(planet.equalsIgnoreCase("Earth")){
            if(temperature<=0){
                System.out.println("It's extremely cold on" + planet + ". Wear heavy clothes and stay indoors with heated rooms.");
            } else if (temperature>0 && temperature<=25) {
                System.out.println("It's quite chilly on " + planet + ". Wear a jacket.");
            } else if (temperature>25 && temperature <=37) {
                System.out.println("It's quite hot on" + planet + ". Wear light clothes and find some shade.");
            } else  System.out.println("It's very hot on " + planet + ". Avoid outside and hydrate continuously.");

        } else if (planet.equalsIgnoreCase("Mars")) {
            if(temperature<=0){
                System.out.println("It's extremely cold on" + planet + ". Wear a space suit with thermal insulation.");
            } else if (temperature>0 && temperature<=80) {
                System.out.println("It's quite chilly on " + planet + ". Wear a jacket.");
            } else if (temperature>80 && temperature <=140) {
                System.out.println("It's quite hot on" + planet + ". avoid space outside");
            } else  System.out.println("It's very hot on " + planet + ". Avoid outside and hydrate continuously.");
        }else if (planet.equalsIgnoreCase("Venus")) {
            if(temperature<=0){
                System.out.println("It's extremely cold on" + planet + ". Wear a space suit with thermal insulation.");
            } else if (temperature>0 && temperature<=80) {
                System.out.println("It's quite chilly on " + planet + ". Wear a jacket.");
            } else if (temperature>80 && temperature <=140) {
                System.out.println("It's quite hot on" + planet + ". avoid space outside");
            } else  System.out.println("It's very hot on " + planet + ". Avoid outside and hydrate continuously.");
        }else if (planet.equalsIgnoreCase("Jupiter")) {
            if (temperature <= 0) {
                System.out.println("It's extremely cold on" + planet + ". Wear a space suit with thermal insulation.");
            } else if (temperature > 0 && temperature <= 80) {
                System.out.println("It's quite chilly on " + planet + ". Wear a jacket.");
            } else if (temperature > 80 && temperature <= 140) {
                System.out.println("It's quite hot on" + planet + ". avoid space outside");
            } else System.out.println("It's very hot on " + planet + ". Avoid outside and hydrate continuously.");
        }else System.out.println("An unknown planet selected");


        // Step 7: Display response
        //System.out.println(advice);

        // Step 8: Close Scanner
        scanner.close();
    }
}
