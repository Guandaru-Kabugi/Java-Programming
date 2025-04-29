import java.util.Scanner;
public class LoopsControlChallenge {
    public static void main(String[] args){

        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        // Step 2: Prompt the user for input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Step 3: Initialize vowel and consonant counters
        int vowels = 0, consonants = 0;
        String vowelsList = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            System.out.println("Do you want to continue? (yes to continue, no to exit)");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("no")) {
                break;
            }

            if (!Character.isLetter(ch)) {
                continue;
            }

            if (vowelsList.indexOf(ch) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Total vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);


        scanner.close();

    }
}
