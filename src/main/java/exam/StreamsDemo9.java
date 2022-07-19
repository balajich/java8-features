package exam;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo9 {
    public static void main(String[] args) {
      Stream<String> stream=Stream.of("A","B","C");
      List<String>result=stream.filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);

        Stream<String> stream1=Stream.of("A","A","B","C");
        result=stream1.distinct().collect(Collectors.toList());
        System.out.println(result);



    }
}
