public class Vehicle {

    String make;
    String color;
    String model;
    int year;

    //creating parameterized constructors
    //using This Key word

    //constructor 1

    public Vehicle(String make, String model, String color){
        System.out.print("New vehicle created. " + make + " " + model + " " + color + "\n");
        this.color = color;
        this.model = model;
        this.make = make;
    }
    //constructor 2
    public Vehicle(){
        System.out.print("Vehicle with no initial details was created\n");
        make = "unknown";
        color = "unknown";
        model = "unknown";
    }
    //constructor 3

    public Vehicle(String make, String model, int year){
        System.out.println("Car Make: " + make + ", Car Model " + model + ", Car Year " + year + "\n");
        this.make = make;
        this.model = model;
        this.year = year;
    }

}
