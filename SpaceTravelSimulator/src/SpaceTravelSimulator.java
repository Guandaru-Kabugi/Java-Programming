import java.util.Scanner;

public class SpaceTravelSimulator {
    public static void main(String[] args){
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        //initialize the array to store astronaut details
        String[] astronautNames = new String[10]; // Maximum 10 astronauts
        int[] astronautAges = new int[10];
        String[] missionStatus = new String[10];
        int numAstronauts = 0; // Track number of astronauts
        boolean continueAsking = true;

        while (continueAsking){
            // Step 2: Display menu options
            System.out.println("Choose an option:");
            System.out.println("1. Add astronaut to mission");
            System.out.println("2. Update astronaut's mission status");
            System.out.println("3. Display all astronauts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Step 3: Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice){
                case 1:
                    // Add astronaut (COMPLETE THIS PART)
                    System.out.print("Enter astronaut's name: ");
                    astronautNames[numAstronauts] = scanner.nextLine();
                    System.out.print("Enter astronaut's age: ");
                    astronautAges[numAstronauts] = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter mission status (On mission / Available): ");
                    missionStatus[numAstronauts] = scanner.nextLine();
                    System.out.println(astronautNames[numAstronauts] + " added to the mission.");
                    numAstronauts++;
                    break;
                case 2:
                    // Update mission status (COMPLETE THIS PART)
                    System.out.print("Enter astronaut's name to update status: ");
                    String astronautName = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < numAstronauts; i++) {
                        if (astronautNames[i].equalsIgnoreCase(astronautName)) {
                        System.out.print("Enter new mission status (On mission / Available): ");
                        missionStatus[i] = scanner.nextLine();
                        System.out.println("Mission status updated for " + astronautName);
                        found = true;}
                       else {
                            System.out.println("Astronaut not found in the mission.");}
                    }
                    break;
                case 3:

                    // Display astronauts (COMPLETE THIS PART)
                    System.out.println("All Astronauts:");
                    if (numAstronauts==0) {
                    System.out.println("No astronauts added to the mission yet.");
                    } else {
                    for (int i = 0; i < numAstronauts; i++) {
                    System.out.println("Name: " + astronautNames[i] + ", Age: " + astronautAges[i] + ", Status: " + missionStatus[i]);
                    }
                    }
                    break;
                case 4:
                    // Exit program
                    continueAsking = false;
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;

            }
        }
        scanner.close();
    }
}
