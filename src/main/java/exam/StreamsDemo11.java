package exam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo11 {
    public static void main(String[] args) {
        Stream<List<String>> stream = Stream.of(List.of("A"), List.of("B", "C"), List.of("D"));
        stream.flatMap(m -> m.stream()).forEach(System.out::println);

        //Sorting List
        Stream<String> stream2 = Stream.of("D", "B");
        List<String> result = stream2.sorted().collect(Collectors.toList());
        System.out.println(result);

        Stream<String> stream3 = Stream.of("D", "B","E");
        List<String> result2=stream3.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result2);


    }
}
