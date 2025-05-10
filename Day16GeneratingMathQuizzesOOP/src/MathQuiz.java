import java.util.Scanner;

public class MathQuiz {
    //track user score

    private int score;

    //create a constructor to initialize the score
    public MathQuiz(){
        this.score = 0;
    }

    //implement a method to start the quiz

    public void startQuiz(){
        Scanner scanner = new Scanner(System.in);
        //5 questions in one quiz
        for (int i = 0; i < 5; i++) {
            askQuestion(scanner);
        }
        System.out.println("Your final score is : " + score + "/5");
        scanner.close();

    }
    //generate a method to generate  quiz and take user input

    private void askQuestion(Scanner scanner){
        Question question = new Question(); //initialize a question object
        question.generateQuestion();
        System.out.print("Your answer is: ");
        double userAnswer = scanner.nextDouble();
        //we check if answer is correct
        if(question.checkAnswer(userAnswer)){
            System.out.println("Correct!");
            score++;
        } else{
            System.out.println("Incorrect answer.");
        }

    }
}
