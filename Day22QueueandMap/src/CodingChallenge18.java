import java.util.ArrayDeque;
import java.util.Deque;

public class CodingChallenge18 {
    public static void main(String[] args) {
        // Create an ArrayDeque to represent a task queue
        Deque<String> taskQueue = new ArrayDeque<>();

        // Add tasks to the queue
        taskQueue.addFirst("Task1");
        taskQueue.addLast("Task2");
        taskQueue.addFirst("Task0");
        taskQueue.addLast("Task4");


        // Process and display each task in FIFO order
        System.out.println("Processing tasks:");
        System.out.println(taskQueue);
    }
}
