package exam;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Integer Streams
 */
public class StreamsDemo19 {
    public static void main(String[] args) {
        DoubleStream stream= DoubleStream.of(10.2,11.2,3.2,4.5);
        double result = stream.reduce(0, (x, y) -> x + y);
        System.out.println(result);
    }
}
