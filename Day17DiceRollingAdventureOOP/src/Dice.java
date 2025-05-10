import java.util.Random;

public class Dice {
    //member variable
    private int value;


    //default constructor to initialize a dice with six sides
    public Dice(){
        this.value = 1; //we start from 1
    }

    //we roll the dice
    public void roll(){
        Random random = new Random();
        this.value = random.nextInt(6) + 1; //starts from 1

    }

    //we use get method to get the current value
    public int getValue(){
        return this.value;
    }

}
