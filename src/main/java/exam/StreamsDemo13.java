package exam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo13 {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("Alex","Stan","Glibart","Mi","Su","Xu");
        List<String> result=stream.filter(s->s.length()==2).sorted().limit(2).collect(Collectors.toList());
        System.out.println(result);

        result=Stream.generate(()->"Hello").filter(s->s.length()==5).limit(3).sorted().collect(Collectors.toList());
        System.out.println(result);

    }
}
