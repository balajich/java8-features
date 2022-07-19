package exam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo10 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("monkey", "gorilla", "chimpangee");
        List<Integer> result = stream.map(String::length).collect(Collectors.toList());
        System.out.println(result);




    }
}
