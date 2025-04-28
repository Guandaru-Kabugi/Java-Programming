import java.util.Scanner;
public class SwitchInsideSwitch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        //switch within switch
        System.out.println("Choose between a or b: ");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice){
            case "a":
                System.out.println("Choose between 1 and 2");
                int num = scanner.nextInt();
                switch (num){
                    case 1:
                        System.out.println("Well done on this selection");
                        break;
                    case 2:
                        System.out.println("We can do better next time.");
                        break;
                    default:
                        System.out.println("You need to select on 1 or 2");
                        break;
                }
                break;
            case "b":
                System.out.println("Choice b has not new selections. ");
                break;
            default:
                System.out.println("Wrong choice.");
                break;
        }
    }
}
