public class SmartPhone {
    String brand;
    String model;
    double price;


    //constructor to initialize a new object
    public SmartPhone(String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //calculate discount
    public void discountCalculator(double percentageDiscount){
        this.price = this.price*(percentageDiscount/100);
    }

    //compare prices by passing in an object as a parameter
    public void comparePrices(SmartPhone otherSmartphone){
        if(this.price< otherSmartphone.price){
            System.out.println(this.model + " is cheaper than " + otherSmartphone.model);
        } else if (this.price>otherSmartphone.price) {
            System.out.println(this.model + " is more expensive than " + otherSmartphone.model);
        }else{
            System.out.println(this.model + " as expensive as " + otherSmartphone.model);
        }
    }

    //Show details
    public void showDetails(){
        System.out.println("The brand is: " +
                brand + "; The model is: " +
                model + "; The model price is: " +
                price);
    }
}
