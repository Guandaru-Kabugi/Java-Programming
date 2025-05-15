import java.util.Scanner;

public class UserRegistrationClass {
    public void registerUser(String password, String confirmPassword){
        try(ValidationLoggerClass logger = new ValidationLoggerClass())
        {
           PasswordValidatorClass validator = new PasswordValidatorClass();
           validator.validatePassword(password,confirmPassword);
           logger.logSuccess();
        }catch (WeakPasswordCustomException | PasswordMismatchException e)
        {
            try(ValidationLoggerClass logger = new ValidationLoggerClass()){
                logger.logFailure(e.getMessage());
            }
        }finally {
            try (ValidationLoggerClass logger = new ValidationLoggerClass()) {
                logger.close();
            }

        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        UserRegistrationClass registration = new UserRegistrationClass();
        registration.registerUser(password, confirmPassword);
    }
}
