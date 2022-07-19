package exam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo16 {
    public static void main(String[] args) {
        //Debug infinite streams
        List<Integer> result=Stream.iterate(1, x -> x + 1).limit(5).peek(System.out::print).filter(x -> x % 2 == 1).collect(Collectors.toList());
        System.out.println(result);

    }
}
