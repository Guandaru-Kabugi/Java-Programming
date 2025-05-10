public class Main {
    public static void main(String[] args){

        SmartAppliances appliance1 = new SmartAppliances(
                "Dispenser","Water Dispenser","On");

        SmartAppliances appliance2 = appliance1.getInstance(); //call the current instance of the class

        //


        appliance2.applianceName = "Dispenser2";

        appliance1.showDetails();
        System.out.println("1------------");
        appliance2.showDetails();
        System.out.println("2------------");


        //all outputs above reference a specific memory and change in one leads to change in the rest.

        //we need to use copy()
        SmartAppliances appliance3 = new SmartAppliances(appliance1);
        appliance3.applianceType ="Dispensing water";
        appliance3.showDetails();
        System.out.println("3---------");

        //using method chaining

        Car car1 = new Car("Audi","A5",2019);
        car1.showDetails();
        System.out.println("1---------");
        car1.setMake("Mercedes").setModel("C200").setYear(2020);
        car1.showDetails();

        System.out.println("---------");
        System.out.println("---------");
        //passing in objects as parameters
        SmartPhone smartPhone1 = new SmartPhone("Huawei", "Y4", 13500.0);
        SmartPhone smartPhone2 = new SmartPhone("Redmi","13C",16000.0);
        SmartPhone smartPhone3 = new SmartPhone("Tecno","C2", 9000.0);

        //smartPhone1.discountCalculator(30);
        smartPhone1.showDetails();
        smartPhone1.comparePrices(smartPhone3);



    }
}
