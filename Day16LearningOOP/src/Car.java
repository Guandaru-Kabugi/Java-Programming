public class Car {

    String color;
    String model;
    int year;

    //creating parameterized constructors

    public Car(String myColor, String myModel){
        System.out.println("New car created. " + myColor + " " + myModel);
        color = myColor;
        model = myModel;
    }

    //it is also possible to use This key word
    //we create a method that takes no parameters and returns nothing
    void showCarDetails(){
        System.out.println("Model: " + model +
                ", Color: " + color +
                ", Year: " + year);
    }
}
