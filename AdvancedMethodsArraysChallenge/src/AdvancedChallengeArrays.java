import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedChallengeArrays {
    // Declare a global ArrayList to store the TODO list
    private ArrayList<String> todoList = new ArrayList<>();
    public void manageToDoList(){

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the TODO List Application!");
        // Menu loop
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next(); // discard invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    removeTask(scanner);
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();






        // Menu loop
        // Display the menu options
        // Consume the newline character
        // Handle the menu choice
        //TODO
    }

    // Method to display the menu
    private void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. View All Tasks");
        System.out.println("4. Exit");
    }

    // Method to add a task to the TODO list
    private void addTask(Scanner scanner) {
        System.out.println("Please add a task: ");
        String task = scanner.nextLine();
        todoList.add(task);
        System.out.println("Task added successfully.");

    }

    // Method to remove a task from the TODO list
    private void removeTask(Scanner scanner) {
        // Display the current tasks
        if(todoList.isEmpty()){
            System.out.println("The list is empty. Nothing to remove");
            return;
        }else{
            displayTasks();
            System.out.println("What number is the task you want to remove? ");
            int number = scanner.nextInt();

            if(number >=1 && number <=todoList.size()){
                String removed = todoList.remove(number-1);
                System.out.println("Task '" + removed + "' removed successfully.");

            }else{
                System.out.println("Invalid number selected.");

            }

        }
        // Remove the task
        //TODO
    }

    // Method to display all tasks in the TODO list
    private void displayTasks() {
        //We check if list is empty
        if (todoList.isEmpty()){
            System.out.println("Your To Do List is empty.");
            return;
        } else{
            System.out.println("Here is the list");
            for (int i = 0; i < todoList.size(); i++) {

                System.out.println((i+1) + ". " + todoList.get(i));
            }
        }

    }
    public static void main(String[] args){
        AdvancedChallengeArrays app = new AdvancedChallengeArrays();
        app.manageToDoList();
    }
}
