import java.util.HashSet;

public class AdvancedCodingChallenge17 {
    public static void main(String[] args){
        // Create a HashSet to store unique names
        HashSet<String> uniqueNames = new HashSet<>();


        // Add names to the HashSet and include a Duplicate entry
        uniqueNames.add("John");
        uniqueNames.add("James");
        uniqueNames.add("James"); //this is ignored

        // Display the names in the HashSet
        System.out.println("Unique Names:");
        System.out.println(uniqueNames);
    }
}
