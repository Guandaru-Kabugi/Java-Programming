public class Main {
    public static void main(String[] args){

        // we instantiate an object here


        //class with This keyword under the constructor

        Vehicle myAudi1 = new Vehicle("Audi","A5","Red");
        Vehicle myMerc = new Vehicle();
        Vehicle myFord = new Vehicle("Ford", "Ranger", 2011);


        Car myAudi = new Car("White", "A6");
        Car myMercedes = new Car("Red", "c250");
        SmartDevice huawei = new SmartDevice();
        huawei.showPhoneDetails(); //relying on the constructor to initialize some details of the object
        SmartDevice redMi = new SmartDevice();

        //we assign attributes to the objects
/*
        myAudi.color = "white";
        myAudi.model = "A5";
        myAudi.year = 2019;
        myAudi.showCarDetails(); //methods within class
        myMercedes.color = "black";
        myMercedes.model = "C200";
        myMercedes.year = 2021;
        myMercedes.showCarDetails(); //methods within class
*/
        //smart device objects
        huawei.brand = "Huawei";
        huawei.model = "y4";
        huawei.batteryLife = 90;
        huawei.connect();



        redMi.brand = "Red Mi";
        redMi.model = "13C";

        //methods
        huawei.showPhoneDetails();
        System.out.println();
        redMi.showPhoneDetails();

        //System.out.println("My first car is an Audi " + myAudi.model + " and the color is " + myAudi.color);
        //System.out.println("My second car is a mercedes benz " + myMercedes.model + " and the color is " + myMercedes.color);
    }
}
