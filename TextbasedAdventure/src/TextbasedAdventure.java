import java.util.Scanner;
public class TextbasedAdventure {
    public static void main(String[] args){

        // Step 1: Declare and initialize Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Display a welcome message and game objective
        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("Your goal is to find the hidden treasure. Choose wisely!");

        // Step 3: Present the first choice to the player
        System.out.println("You are at a crossroad. Do you want to go left or right?");


        // Step 4: Take the user's first choice input
        System.out.print("Type 'left' or 'right': ");
        String choice = scanner.nextLine();

        // Step 5: First level of decision-making using switch-case
        switch (choice){
            case "left":
                System.out.println("You walk down a dark path and find a mysterious cave.");
                System.out.println("Do you want to enter the cave or walk past it?");
                System.out.print("Type 'enter' or 'walk': ");
                String choice1 = scanner.nextLine();
                switch(choice1){
                    case "enter":
                        System.out.println("Inside the cave, you find a sleeping dragon!");
                        System.out.println("Do you want to fight the dragon or sneak past it?");
                        System.out.print("Type 'fight' or 'sneak': ");
                        String choice2 = scanner.nextLine();
                        switch (choice2){
                            case "fight":
                                System.out.println("You bravely fight the dragon!");
                                System.out.println("After an intense battle, the dragon breathes fire and defeats you.");
                                System.out.println("Sadly, your quest ends here. Game Over.");
                                break;
                            case "sneak":
                                System.out.println("You sneak past the dragon and find the treasure behind it. You win!");
                                break;
                            default:
                                System.out.println("You selected wrongly. either fight or sneak.");
                                break;
                        }
                        break;
                    case "walk":
                        System.out.println("You walk past the cave and continue down the path.");
                        System.out.println("Suddenly, you stumble upon a hidden pit and fall in!");
                        System.out.println("Unfortunately, you are trapped. Game Over.");
                        break;
                    default:
                        System.out.println("You did not select enter or walk!");
                        break;
                }
                break;
            case "right":
                System.out.println("You take the right path and find yourself at the edge of a river.");
                System.out.println("There's an old bridge and a boat tied nearby.");
                break;
            default:
                System.out.println("You selected the wrong direction. You die!!");
                break;
        }


        // Step 7: Close the Scanner
        scanner.close();
    }
}
