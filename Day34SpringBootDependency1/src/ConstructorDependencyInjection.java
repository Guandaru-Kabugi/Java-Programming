public class ConstructorDependencyInjection {
    public static void main(String[] args) {
        //constructor dependency injection
        Engine myEngine = new Engine();
        //Car myCar = new Car(myEngine); //car is dependent on engine
        //myCar.drive();
    }

}
