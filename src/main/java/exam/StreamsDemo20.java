package exam;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Integer Streams
 */
public class StreamsDemo20 {
    public static void main(String[] args) {
       DoubleStream.generate(Math::random).limit(10).forEach(System.out::println);
        IntStream.range(1,6).forEach(System.out::println);

        System.out.println(Stream.of(10.1,10.2).mapToDouble(x->x).summaryStatistics());
        int result = Stream.of("ABC", "XYZ").mapToInt(s -> s.length()).sum();
        System.out.println(result);
        int result1 = Stream.of("ABC", "XYZ").reduce("", (x, y) -> x + y).length();
        System.out.println(result1);

    }
}
