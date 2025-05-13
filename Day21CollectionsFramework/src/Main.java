import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");

        System.out.println("First fruits:" + fruits.getFirst());
    }

}
