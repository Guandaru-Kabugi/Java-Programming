public class SmartDevice {

    String brand;
    String model;
    int batteryLife = 40;
    boolean connection = false;

    //default constructor . access modifier public and name of the original class
    public SmartDevice(){
        brand = "Unknown";
        model = "Unknown";
    }

    //connection method
    void connect(){
        System.out.println("Connecting to a charger.");
        connection = true;

    }
    //disconnection method
    void disconnect(){
        System.out.println("Disconnecting from a charger.");
        connection = false;

    }
    //display details method
    void showPhoneDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Connection: " + connection);

    }
}
