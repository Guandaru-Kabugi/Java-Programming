import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Pineapple");
        set.add("Dates");
        set.add("Grapes");
        set.add("Mango");
        set.add("Dragon Fruit"); //this is not added because it is a duplicate. it is case sensitive
        System.out.println("Hash Set results: " + set);
        boolean contains = set.contains("Banana");

        System.out.println("Is banana present: " + contains);
        set.remove("Banana");
        int size = set.size(); //shows size
        System.out.println("Size of set: " + size);
        //iteration

        for (String element: set){
            System.out.println(element);
        }

        


    }
}
