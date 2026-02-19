import java.util.HashMap;
import java.util.Map;

public class Day09_MapOperations {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.putIfAbsent("Two", 22);

        System.out.println("HashMap: " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}