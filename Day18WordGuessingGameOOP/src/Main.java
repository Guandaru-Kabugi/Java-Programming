import java.util.Random;

public class Main {

    public static void main(String[] args){
        Random random = new Random();
        String[] wordPool = {"inheritance", "polymorphism", "encapsulation", "abstraction", "interface"};
        String wordToBeGuessed = wordPool[random.nextInt(wordPool.length)];

        AdvancedGame game = new AdvancedGame(wordToBeGuessed);
        game.playGame();
    }
}
