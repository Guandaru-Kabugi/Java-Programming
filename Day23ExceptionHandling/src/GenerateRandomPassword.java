import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenerateRandomPassword {

    //we initialize private class variables
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-+";
    private static final int PASSWORD_LENGTH = 15;

    private static final SecureRandom random = new SecureRandom();

    public static String generateStrongPassword(){
        //we use list as its more flexible to change later. an interface
        List<Character> passwordChars = new ArrayList<>();

        //ensure that at least one character from each category
        passwordChars.add(getRandomChar(UPPER));
        passwordChars.add(getRandomChar(LOWER));
        passwordChars.add(getRandomChar(DIGITS));
        passwordChars.add(getRandomChar(SPECIAL));

        //Fill rest with random characters
        String allChars = UPPER + LOWER + DIGITS + SPECIAL;
        //looping starts at 4 because we have filled first three spots
        for (int i = 4; i < PASSWORD_LENGTH; i++) {
            passwordChars.add(getRandomChar(allChars));
        }
        Collections.shuffle(passwordChars);

        //convert to String

        StringBuilder password = new StringBuilder();

        for (char ch: passwordChars){
            password.append(ch);
        }
        return password.toString();


    }
    //we get a random char
    private static char getRandomChar (String charSet){
        return charSet.charAt(random.nextInt(charSet.length()));

    }
    // Optional: For testing
    public static void main(String[] args) {

        String generatedPass = generateStrongPassword();
        try(FileOutputStream fos = new FileOutputStream("src/main/resources/generatedOutput.txt")){
            byte[] byteArray = generatedPass.getBytes();
            fos.write(byteArray);
            fos.flush();
            System.out.println("Generated data printed out.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //System.out.println("Generated Password: " + generateStrongPassword());
    }
}

