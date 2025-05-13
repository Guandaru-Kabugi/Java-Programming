import java.util.Map;
import java.util.TreeMap;
public class TreeMapping {
    public static void main(String[] args){
        Map<String,Integer> inventory = new TreeMap<>();

        //add key value pairs

        inventory.put("Apple",50);
        inventory.put("Banana",20);
        inventory.put("Orange",10);

        //iteration
        for (Map.Entry<String,Integer> entry:inventory.entrySet()){
            System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());

        }
    }
}
