package exam;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo27 {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("tiger","lion","bear");
        Map<Integer, List<String>> result = stream.collect(Collectors.groupingBy(String::length));
        System.out.println(result);

        Stream<String> stream2=Stream.of("tiger","lion","bear");
        Map<Integer, Set<String>> result2 = stream2.collect(Collectors.groupingBy(String::length,Collectors.toSet()));
        System.out.println(result2);
    }
}
