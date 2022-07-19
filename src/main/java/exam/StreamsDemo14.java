package exam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo14 {
    public static void main(String[] args) {
        System.out.println(Stream.of("Goldfish", "Fish").filter(s -> s.length() == 4).collect(Collectors.toList()).stream().count());


    }
}
