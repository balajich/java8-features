package exam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *Sum of Integers -finite streams
 */
public class StreamsDemo17 {
    public static void main(String[] args) {
        Integer result = Stream.of(1, 2, 3, 4).reduce(0, (x, y) -> x + y);
        System.out.println(result);

        int result1=Stream.of(1,2,3,4,5).mapToInt(x->x).sum();
        System.out.println(result1);


    }
}
