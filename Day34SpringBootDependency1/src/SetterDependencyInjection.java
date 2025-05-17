public class SetterDependencyInjection {
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        Car myCar = new Car();
        myCar.setEngine(myEngine); //must set it first
        myCar.drive();

        ElectricEngine myElectricEngine = new ElectricEngine();
        myCar.setEngine(myElectricEngine);
        myCar.drive();
    }
}
