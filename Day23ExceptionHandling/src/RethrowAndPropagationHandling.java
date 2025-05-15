public class RethrowAndPropagationHandling {
    public static void main(String[] args) {
        //handle it here
        try{
            performTransaction();
        }catch (Exception e){
            System.out.println("Exception caught in main: " + e.getMessage());
            //e.printStackTrace(); traces back to the origin of error
        }
        finally {
            System.out.println("Appears after error handling");
        }

    }
    //rethrow error
    public static void performTransaction() throws Exception{
        try{
            debitAccount();
        }catch (Exception e){
            throw new Exception("Transaction failed during debit operation",e);
        }
    }
    //propagate here
    public static void debitAccount()throws Exception{
        validateFunds();
    }
    public static void validateFunds() throws Exception{
        throw new Exception("Insufficient funds in the account.");
    }

}
