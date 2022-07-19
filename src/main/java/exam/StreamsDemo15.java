package exam;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo15 {
    public static void main(String[] args) {
        //infinite streams
        System.out.println(Stream.iterate(1, x -> x + 1).limit(5).filter(x -> x % 2 == 1).collect(Collectors.toList()));
    }
}
