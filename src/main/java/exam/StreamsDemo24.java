package exam;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collectors
 */
public class StreamsDemo24 {
    public static void main(String[] args) {
        Stream<String> stringStream= Stream.of("a","b","C");
        System.out.println(stringStream.map(String::toUpperCase).collect(Collectors.joining(",")));


        var ohMy = Stream.of("lions", "tigers", "bears");
        Double result = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result);
    }
}
