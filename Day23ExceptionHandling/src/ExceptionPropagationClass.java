public class ExceptionPropagationClass {
    public static void main(String[] args) {
        //main handles the error

        try{
            processOrder();
        }catch (Exception e){
            //catch the error in main
            System.out.println("Exception caught in main: " + e.getMessage() );
        }

    }
    public static void processOrder() throws Exception{
        calculateTotalPrice(); // might throw an exception
    }
    public static void calculateTotalPrice() throws Exception{
        checkInventory();//calling check inventory, which might throw an exception
    }
    public static void checkInventory() throws Exception{
        throw new Exception("Insufficient inventory for the order."); //throws an exception
    }
}
