package CodeChallenge16;

public class Main {
    public static void main(String[] args){
        // Implement the polymorphism demonstration
        // Create Vehicle objects using polymorphism
        // Call the drive method for each vehicle
        Vehicle vehicle1 = new Car("Audi", "A5");
        Vehicle vehicle2 = new Bike("Yamaha", "Sport Bike");

        vehicle1.drive();
        vehicle2.drive();
    }
}
