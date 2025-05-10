public class Car {
    private String make;
    private String model;
    private int year;


    //constructor
    public Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void showDetails(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Make Year: " + year);
    }
    //we can use setters to make changes to the attributes

    public Car setMake(String make) {
        this.make = make;
        return this;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }
}
