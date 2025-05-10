import java.util.Random;

public class AdvancedGame extends InputGame{

    Random random;
    //this is a constructor from parent
    public AdvancedGame(String wordToBeGuessed) {
        super(wordToBeGuessed);
        this.random = new Random();
    }

    @Override
    public void displayHint() {
        super.displayHint();
        if(attempts>0){
            revealRandomLetter();
            System.out.println("🔍 Revealed so far: " + getRevealedWord());
        }
    }

    //private method only accessible by the class
    //we are using a do while loop to get a letter an index randomly
    //the index is then passed on revealed letters
    private void revealRandomLetter(){
        int index;
        do {
            index = random.nextInt(wordToBeGuessed.length());
        }while(revealedLetters[index] !='-');
        revealedLetters[index] = wordToBeGuessed.charAt(index);
    }
}
