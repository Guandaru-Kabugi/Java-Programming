import java.util.Scanner;
public class MagicMirror {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to enter a string
        System.out.println("Enter a string to reflect in the magic mirror:");
        String inputString = scanner.nextLine();

        // Step 3: Reverse the string using the recursive method (COMPLETE THIS PART)
        String reversedString = reverseString(inputString);

                // Step 4: Print the reversed string
                System.out.println("The magic mirror reflects: " + reversedString);

        scanner.close();

    }

    public static String reverseString(String str){
        // Base case: If the string is empty or has one character, return it
        if(str.isBlank() || str.length()==1){
            return str;
        }
        // Recursive case: Take the last character and add it to the reversed rest of the string
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));


    }
}
