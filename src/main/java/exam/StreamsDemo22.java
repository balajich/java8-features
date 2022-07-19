package exam;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Integer Streams
 */
public class StreamsDemo22 {
    public static void main(String[] args) {
        Optional.of(123).
                map(n -> String.valueOf(n)) //convert number to string
                .filter(s -> s.length() == 3)// If string is larger than 3
                .ifPresent(System.out::println);//If values present , print them
    }
}
