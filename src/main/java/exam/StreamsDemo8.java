package exam;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo8 {
    public static void main(String[] args) {
      Stream<String> stream=Stream.of("A","B","C");
        StringBuilder result = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(result);

        Stream<String> stream1=Stream.of("w","o","l","f");
        TreeSet<Object> result2 = stream1.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(result2);

        System.out.println(List.of(1,2,4,3).stream().collect(Collectors.toList()));
        System.out.println(List.of(1,1,2,3).stream().collect(Collectors.toSet()));

    }
}
