import java.util.Scanner;

public class InputGame extends Game{

    protected Scanner scanner;

    //constructor inherited from parent
    public InputGame(String wordToBeGuessed) {
        super(wordToBeGuessed);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void playGame() {
        super.playGame();
        String userGuess = ""; //initialize an empty string
        //a loop until user guess is correct
        while(!userGuess.equalsIgnoreCase(wordToBeGuessed)){
            displayHint();
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextLine();
            attempts++; //we add attempts

            //we check if answer is correct
            if (userGuess.equalsIgnoreCase(wordToBeGuessed)){
                System.out.println("🎉 Congratulations! You've guessed the word in " + attempts + " attempts.");
            }else{
                System.out.println("❌ Incorrect guess. Try again!");
                System.out.println("Revealed so far: " + getRevealedWord());
            }

        }
    }
}
