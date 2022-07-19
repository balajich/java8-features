package exam;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo3 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("A", "B", "C", "D");
        Optional<String> result = stringStream.min(String::compareTo);
        result.ifPresent(System.out::println);

        Stream<String> stringStreamNew = Stream.of("A", "B", "C", "D");
        Optional<String> resultMax = stringStreamNew.max(String::compareTo);
        resultMax.ifPresent(System.out::println);

        Stream<String> stringStream3 = Stream.of("A", "A", "A", "A");
        Optional<String> resultMax1 = stringStream3.max(String::compareTo);
        resultMax1.ifPresent(System.out::println);

        Optional<?> result2= Stream.empty().min((s1,s2)->0);
        //result2.get();//This throws exception
        System.out.println(result2.isPresent()?result2.get():"No value present");
    }
}
