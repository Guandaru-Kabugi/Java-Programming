public class Game {

    //we get member variables
    //we are rolling dice twice. Dice is a class, so we get two objects

    private Dice dice1;
    private Dice dice2;
    private int score;
    private int targetScore;

    //we initialize a constructor

    public Game(int targetScore){
        this.dice1 = new Dice();
        this.dice2 = new Dice();
        this.score = 0;
        this.targetScore = targetScore;
    }

    //method to roll the dice and update score
    public void rollDice(){
        dice1.roll();
        dice2.roll();
        System.out.println("Dice 1: " + dice1.getValue());
        System.out.println("Dice 2: " + dice2.getValue());
        this.score += dice1.getValue() + dice2.getValue();

        if(dice1.getValue()==dice2.getValue()){
            System.out.println("You rolled a double! Bonus points added.");
            this.score+=10;
        }
    }
    //display the current score
    public void displayScore(){
        System.out.println("Current Score: " + this.score);
        System.out.println("Target Score: " + this.targetScore);
    }
    //method to check if target score has been reached

    public boolean isTargetReached(){
        return this.score >= this.targetScore;
    }
}
