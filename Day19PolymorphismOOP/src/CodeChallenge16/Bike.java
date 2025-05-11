package CodeChallenge16;

public class Bike extends Vehicle{
    String type;
    //constructor
    public Bike(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    void drive() {
        System.out.println(name + type + " is being ridden.");
    }
}
