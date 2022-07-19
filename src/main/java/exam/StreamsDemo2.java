package exam;

import java.util.List;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo2 {
    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(1,2,3);
        System.out.println(stream.count());

        Stream<Integer> infiniteStream=Stream.iterate(1,n->n+2);
        System.out.println(infiniteStream.count());


    }
}
