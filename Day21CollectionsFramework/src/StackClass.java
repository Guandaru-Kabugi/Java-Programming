import java.util.Stack;

public class StackClass {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third"); //add new item we use push

        System.out.println("Stack: " + stack);
        //see top item
        String topElement = stack.peek();
        System.out.println("top item: " + topElement); //the result is third because its the new one created
        //remove top item we use pop. e.g.
        String removedElement = stack.pop();
        System.out.println("Removed item: " + removedElement);
        stack.push("Fourth");

        //we can also search and get index for an item
        int position = stack.search("Second");
        System.out.println("Position of Second: " + position); //result is first because we removed the top stack

        //check if stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);


    }
}
