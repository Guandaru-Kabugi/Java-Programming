import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    //we initial an arraylist to store items across the different methods

    private static final ArrayList<String> tasks = new ArrayList<>();

    //an array to store completed task
    private static final ArrayList<Boolean> isCompleted = new ArrayList<>();


    public static void main(String[] args){

        //initialize scanner

        Scanner scanner  = new Scanner(System.in);
        //initialize a loop that will keep showing the menu until exit

        boolean runningProgram = true;

        while(runningProgram){
            menuList();
            int choice = scanner.nextInt();
            scanner.nextLine(); //we consume the new line

            switch (choice){

                case 1:
                    addTask(scanner); //we add scanner because we passed it earlier.
                    break;
                case 2:
                    showAllTasks();
                    break;
                case 3:
                    updateTask(scanner);
                    break;
                case 4:
                    removeTask(scanner);
                    break;
                case 5:
                    runningProgram = false;
                    System.out.println("Goodbye for now.");
                    break;
                case 6:
                    markTaskAsCompleted(scanner);
                    break;
                case 7:
                   showAllCompletedTasks();
                    break;
                default:
                    System.out.println("Sorry. You entered the wrong choice.");
            }

        }
        scanner.close();


    }

    //menu

    private static void menuList(){
        System.out.println("\nTo-Do List Application");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Update a task");
        System.out.println("4. Remove a task");
        System.out.println("5. Exit");
        System.out.println("6. Mark a task as completed.");
        System.out.println("7. Show all tasks marked as completed.");
        System.out.print("Choose an option: ");
    }

    //add task

    private static void addTask(Scanner scanner){ //we are passing scanner so that it is accessible
        System.out.println("Please enter the task you want to add.");
        String newTask = scanner.nextLine();
        tasks.add(newTask);
        isCompleted.add(false);
        System.out.println("Task added successfully.");
    }

    //show all task

    private static void showAllTasks(){
        //we check if the arraylist is empty
        if(tasks.isEmpty()){
            System.out.println("No tasks present in the ToDo App.");
        }else{
            System.out.println("Here is your list of tasks.");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i+1) + "." + tasks.get(i));
            }
        }
    }
    //remove a task
    private static void removeTask(Scanner scanner){
        //we check if arraylist is empty first
        if(tasks.isEmpty()){
            System.out.println("The task list is empty. Nothing to remove.");
        }else{
            showAllTasks();
            //we ask user to pick a task
            System.out.println("Pick a task number to remove. ");
            int index = scanner.nextInt();

            //we check if the index given is within the range of 1 to the length of the tasks arraylist
            if(index>=1 && index<= tasks.size()){

                String removed = tasks.remove(index-1); //because in the show list we add plus 1 to the indexing

                System.out.println("Task " + removed + " removed successfully.");

            }

        }
    }
    //update a task

    private static void updateTask(Scanner scanner){
        //we check if array is empty
        if(tasks.isEmpty()){
            System.out.println("The task list is empty. Nothing to update");
        }else{
            showAllTasks();
            System.out.println("Select a number for the task you want to update.");
            int numChoice = scanner.nextInt();
            scanner.nextLine();
            if(numChoice>=1 && numChoice<=tasks.size()){
                tasks.remove(numChoice-1); //I am using -1 because I had added +1 under show tasks
                System.out.println("Please enter the new task update you want");
                String newTask = scanner.nextLine();
                tasks.add(numChoice-1, newTask);
                System.out.println("The new task is " + newTask);
            }
        }
    }

    //bonus. mark a task as completed
    private static void markTaskAsCompleted(Scanner scanner){
        if(tasks.isEmpty()){
            System.out.println("The list of tasks is empty");
        }else{
            showAllTasks();
            System.out.print("Enter the task number to mark as completed: ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();
            if(taskNumber>=1 && taskNumber<=tasks.size()){
                isCompleted.set(taskNumber-1,true);
                System.out.println("Task marked as completed.");
            }else{
                System.out.println("You entered an invalid task number.");
            }
        }
    }
    //show all tasks marked as read
    private static void showAllCompletedTasks(){
        //if the arraylist is empty
        if(isCompleted.isEmpty()){
            System.out.println("There are no tasks marked as completed.");
        }else{
            System.out.println("Here is the list of tasks.\n");
            for (int i = 0; i < isCompleted.size(); i++) {
                System.out.println("Is completed details:" + (i+1) + "." + isCompleted.get(i) + ": Name of task: " + tasks.get(i));

            }
        }
    }
}
