import java.util.HashMap;
import java.util.Map;


public class hashMapping {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA","Washington D.C");
        capitals.put("Germany","Berlin");
        capitals.put("France","Paris");
        capitals.put("England","London");

        //other methods include replace


        System.out.println("Capital of Germany is " + capitals.get("Germany"));
        capitals.remove("France");
        //iteration
        for (Map.Entry<String,String> capital:capitals.entrySet()){
            System.out.println("Capital for " + capital.getKey() + " is " + capital.getValue());

        }

    }
}
