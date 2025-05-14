public class ThrowingErrorsExample {
    public static void main(String[] args) {
        //learning how to through a custom error
        try{
            validatePassword("");
        }catch (IllegalArgumentException e){
            System.out.println("Password cannot be empty");
        }


    }
    public static void validatePassword(String password){
        //take a string. check if empty or null
        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be empty.");
        }
    }
}
