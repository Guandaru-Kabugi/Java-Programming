import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args){
        //create priority queue
        Queue<Integer> priorityQueue = new java.util.PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(60);
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);

        System.out.println("Priority Queue: " + priorityQueue);//output. smallest is the prioritized one. the rest do not matter
        int removedElement = priorityQueue.poll();//you may need if statement to check if empty before polling
        System.out.println(removedElement);
        System.out.println("Priority Queue: " + priorityQueue);


    }
}
