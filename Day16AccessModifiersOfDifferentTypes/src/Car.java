public class Car {
    //this is a private variable
    private String brand;
    private String model;


    //this is a default modifier accessible elsewhere from the classes in the package

    void drive(){
        System.out.println("Driving.");

    }

    //cannot be accessed outside this class
    private void stop(){
        System.out.println("Stopping");
    }

    //we can create another void method to ease accessibility

    void justDriving(){
        stop();
    }
    //restricting setting of model only in the constructor and nowhere else
    public Car(String model){
        this.model = model;
    }

    //using setters to determine what can be modified
    //setter can also restrict users from setting a specific brand

    public void setBrand(String brand){
        if(brand.equalsIgnoreCase("Toyota")){
            System.out.println("We do not support Toyota brands and the default is selected as Audi");
            brand = "Audi";
        }
        this.brand = brand;
    }
    public void displayCarDetails(){
        System.out.println("The car brand is " + brand + ", and the model is " + model);
    }
}
