package may_19_2023;

import java.util.HashMap;
import java.util.Map;

public class LambdaKeyValueExample {
    public static void main(String[] args) {
        // Create a map of key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        // Iterate over the map using lambda expression
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Filter the map using a lambda expression
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
    }
}
