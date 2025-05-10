import java.util.Arrays;

public class Game {

    //member variables. we practice with protected
    protected String wordToBeGuessed;
    protected int attempts;
    //an array to store the characters
    protected char[] revealedLetters;

    //initialize a constructor
    public Game(String wordToBeGuessed){ //has an input of the word
        this.wordToBeGuessed = wordToBeGuessed;
        this.attempts = 0; //start from zero
        this.revealedLetters = new char[wordToBeGuessed.length()]; //we initialize an array of chars
        //since we reveal one letter in each call of the game
        //we can use a loop
        Arrays.fill(revealedLetters, '-');
    }
    //we start of the game
    public void playGame(){
        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the word!");
    }
    //display hint
    public void displayHint(){
        System.out.println("Hint: The word has " + wordToBeGuessed.length() + " letters");
    }
    //get the revealed word
    public String getRevealedWord(){
        return new String(revealedLetters);
    }

}
