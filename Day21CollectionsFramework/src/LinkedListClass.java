import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args){
        LinkedList<String> fruits = new LinkedList<>();

        fruits.addFirst("Apple");
        fruits.addLast("Mango");

        System.out.println("Linked List. Item 1: " + fruits.getFirst());

    }
}
