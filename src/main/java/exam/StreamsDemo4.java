package exam;

import java.awt.*;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo4 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("A", "B", "C");
        Optional<String> result = stringStream.findFirst();
        result.ifPresent(System.out::println);

        Stream<String> stringStream1 = Stream.generate(() -> "Hello");
        stringStream1.findFirst().ifPresent(System.out::println);

    }
}
