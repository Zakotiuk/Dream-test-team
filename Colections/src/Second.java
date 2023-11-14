import java.util.HashMap;
import java.util.Map;

public class Second {

    public static void main(String[] args) throws Exception {
        
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Derchenko", "Boria");
        personMap.put("Tiolova", "Olia");
        personMap.put("Kisob", "Anna");
        personMap.put("Farenko", "Anna");
        personMap.put("Kerena", "Alla");
        personMap.put("Ohila", "Oleg");
        personMap.put("Varchen", "Ivan");

        //Output the entities of the map on the screen
        System.err.println(personMap);

        // Remove from the map person whose firstName is ”Anna” (or other). Print result. 
        Map<String, String> personReverseMap = new HashMap<>();
        for (String name : personMap.keySet()) {
            personReverseMap.put(personMap.get(name), name);
        }
        personMap.clear();
        for (String name : personReverseMap.keySet()) {
            personMap.put(personReverseMap.get(name), name);
        }

        System.err.println("Without \"Anna\" : " + personMap);
    }
}
