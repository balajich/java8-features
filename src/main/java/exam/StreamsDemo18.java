package exam;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Integer Streams
 */
public class StreamsDemo18 {
    public static void main(String[] args) {
        OptionalDouble result = IntStream.of(1, 2, 3, 4).average();
        System.out.println(result.getAsDouble());


    }
}
