public class RethrowingErrors {
    public static void main(String[] args) {
        //learning how to through a custom error
        try{
            handleUserRegistration("Alex", "1234");
            handleUserRegistration("James", "");
        }catch (Exception e){
            System.out.println("An exception caught in user registration. " + e.getMessage());
        }


    }
    //rethrowing the error.
    //we use Exception, which is a checked class by the complier
    //we must add throws exception in the method signature.
    //we add a new message under throw new exception as context.
    public static void handleUserRegistration(
            String username,String password) throws Exception {
        try{
            validatePassword(password);
            System.out.println("User" + username + " created successfully.");
        } catch (Exception e) {
            System.out.println("Error in registering the user." + e.getMessage());
            throw new Exception("Registration failed for new user: " + username,e); //we must throw exception to eliminate complier error
        }
    }
    //initial throw exception error handling
    public static void validatePassword(String password){
        //take a string. check if empty or null
        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be empty.");
        }
    }
}
