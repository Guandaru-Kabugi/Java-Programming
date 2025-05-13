import java.util.Vector;

public class VectorClass {
    public static void main(String[] args){
        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Oranges");

        System.out.println("Second Item in Vector: " + fruits.get(1));


    }
}
