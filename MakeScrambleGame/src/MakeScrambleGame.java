import java.util.Random;
import java.util.Scanner;

public class MakeScrambleGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //predefined list
        String[] wordList = {
                "Lantern", "Whisper", "Glacier",
                "Puzzle", "Orbit",
                "Velvet", "Cactus",
                "Marvel", "Thread", "Sizzle"
        };
        int playerScore = 0;
        boolean keepPlaying = true;
        System.out.println("Welcome to Word Scramble Game!");
        System.out.println("Unscramble the magic words to score points!");

        //game loop
        while(keepPlaying){
            String word = wordList[random.nextInt(wordList.length)];
            String scrambledWord = scrambledWord(word,random);
            System.out.println("Scrambled word. " + scrambledWord);
            boolean wordGuessed = false;
            int attempts = 3;

            while(attempts>0 && !wordGuessed){
                System.out.println("Your guess: ");
                String playerGuess = scanner.nextLine();

                if(playerGuess.equalsIgnoreCase(word)){
                    System.out.println("Correct. You have unscrambled the word: " + word);
                    playerScore++;
                    wordGuessed = true;
                }else{
                    attempts--;
                    System.out.println("Wrong! attempts remaining: " + attempts);

                }
            }

            if(!wordGuessed){
                System.out.println("The correct word was: " + word);
            }
            System.out.println("Your current score: " + playerScore);
            System.out.println("Do you want to play again? (yes/no): ");
            String answer = scanner.nextLine();
            keepPlaying = answer.equalsIgnoreCase("yes");

        }

        System.out.println("Thank you for playing. You score is: " + playerScore);


        scanner.close();
    }
    // to get the scrambled word
    public static String scrambledWord(String word, Random random){

        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            int j = random.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;

        }
        return new String(letters); //generates the string of the word back

    }
}
