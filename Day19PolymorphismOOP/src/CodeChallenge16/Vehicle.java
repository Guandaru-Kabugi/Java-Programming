package CodeChallenge16;

public abstract class Vehicle {
    String name;

    public Vehicle(String name){
        this.name = name;
    }

    abstract void drive();
}
