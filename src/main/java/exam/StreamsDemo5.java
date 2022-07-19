package exam;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo5 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("A", "A", "A");
        System.out.println(stream1.allMatch((s) -> s.equals("A")));

        stream1 = Stream.of("A", "A", "A");
        System.out.println(stream1.anyMatch((s) -> s.equals("A")));

        stream1 = Stream.of("A", "A", "A");
        System.out.println(stream1.noneMatch((s) -> s.equals("A")));

        stream1 = Stream.of("A", "A", "A");
        stream1.forEach(System.out::println);

    }
}
