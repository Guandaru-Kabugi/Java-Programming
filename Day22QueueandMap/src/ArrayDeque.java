import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args){
        //can give top and bottom item
        Deque<String> arrayDeque = new java.util.ArrayDeque<>();
        arrayDeque.addFirst("First");
        arrayDeque.addLast("Second");
        arrayDeque.addLast("Third");
        arrayDeque.addLast("Fourth");
        System.out.println("ArrayDeque: " + arrayDeque);

        String removeFirst = arrayDeque.removeFirst();
        System.out.println("Removed First: " + removeFirst);

        String removeLast = arrayDeque.removeLast();
        System.out.println("Removed Last: " + removeLast);

        String peekFirst = arrayDeque.peekFirst();
        System.out.println("Peeked item: " + peekFirst);

        String peekLast = arrayDeque.peekLast();
        System.out.println("Peeked last: " + peekLast);
    }
}
