package CodeChallenge16;

public class Car extends Vehicle{
    //constructor matching super
    String model;
    public Car(String name,String model) {
        super(name);
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println(name + model + " is being driven.");
    }
}
