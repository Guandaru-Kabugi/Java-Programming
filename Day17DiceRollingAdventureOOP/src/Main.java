import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Lucky Dice Adventure!");
        System.out.print("Enter the target score to win: ");
        int targetScore = scanner.nextInt();
        scanner.nextLine(); //consume new line

        //initialize the first game
        Game game = new Game(targetScore);

        //create a loop to continue playing until correct score is reached
        boolean continuePlaying = true;

        while(continuePlaying){
            System.out.println("Type 'r' to roll and 's' to stop.");

            char choice = scanner.next().charAt(0);

            if(choice=='r'){
                game.rollDice();
                game.displayScore();
                if(game.isTargetReached()){
                    System.out.println("Congratulations! You have reached the target score");
                    continuePlaying = false;
                }

            } else if (choice=='s') {
                System.out.println("You chose to stop. Final Score: ");
                game.displayScore();
                continuePlaying = false;


            }else{
                System.out.println("You entered the wrong choice.");
            }


        }

        scanner.close();



    }

}
