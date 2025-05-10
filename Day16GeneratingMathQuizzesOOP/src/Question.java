import java.util.Random;

public class Question {

    //member variables
    private final int operand1;
    private final int operand2;
    private final char operator;
    private double correctAnswer;

    //we create a constructor to generate arithmetic question

    public Question(){
        //initialize random object
        Random random = new Random();

        this.operand1 = random.nextInt(100) +1; //in case the random num is 0
        this.operand2 = random.nextInt(100) + 1;
        char[] operators = {'+','-','*','/'}; //an array of operators
        this.operator = operators[random.nextInt(4)]; //selects a random operator
        //call a method to perform the calculation
        calculateAnswer(); //we get the answer every time the a new question is generated


    }
    //we then implement the method that calculates the correct answer
    // we make the method private
    private void calculateAnswer(){
        //we use a switch statement here
        switch(operator){
            case '+':
                correctAnswer = operand1 + operand2;
                break;
            case '-':
                correctAnswer = operand1 - operand2;
                break;
            case '/':
                correctAnswer = (double) operand1 / operand2;
                break;
            case '*':
                correctAnswer = operand1 * operand2;
                break;
            default:
                System.out.println("You entered the wrong symbol.");
                break;
        }

    }
    //display the question
    public void generateQuestion(){
        System.out.println("What is " + operand1 + " " + operator + " " + operand2 + "?");

    }
    //Check if answer from user is correct. It means we accept a parameter
    public boolean checkAnswer(double userAnswer){
        return Math.abs(userAnswer-correctAnswer)<0.001; //allows only for a small deviation from correct answer

    }

}
