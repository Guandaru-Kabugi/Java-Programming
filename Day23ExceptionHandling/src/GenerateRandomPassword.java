import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class GenerateRandomPassword {

    //we initialize private class variables
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-+";
    private static final int PASSWORD_LENGTH = 15;

    private static final SecureRandom random = new SecureRandom();

    public static String generateStrongPasword(){
        //we use list as its more flexible to change later. an interface
        List<Character> passwordChars = new ArrayList<>();

        //ensure that at least one character from each category

    }
    //we get a random char
    private static char getRandomChar (String charSet){
        return charSet.charAt(random.nextInt(charSet.length()));
    }
}

