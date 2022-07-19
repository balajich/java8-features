package exam;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Integer Streams
 */
public class StreamsDemo21 {
    public static void main(String[] args) {
      IntStream.of(1,2,3,4,5).average().ifPresent(System.out::println);
    }
}
