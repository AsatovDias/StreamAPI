import java.util.*;
import java.util.stream.*;

public class StreamApiDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Charlie", "Anna", "Amanda");

        // Stream pipeline example 
        List<String> result = names.stream()                // 1. Convert to Stream
            .filter(name -> name.startsWith("A"))           // 2. Filter elements
            .map(String::toUpperCase)                       // 3. Transform elements
            .distinct()                                     // 4. Remove duplicates
            .sorted()                                       // 5. Sort elements
            .limit(5)                                       // 6. Take first 5 elements
            .collect(Collectors.toList());                  // 7. Terminal operation to List

        System.out.println("Result: " + result);

        // Optional: count how many elements after filter
        long count = names.stream()
            .filter(name -> name.startsWith("A"))
            .count();

        System.out.println("Count of 'A' names: " + count);
    }
}

