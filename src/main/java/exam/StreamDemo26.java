package exam;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collectors to map
 */
public class StreamDemo26 {

    public static void main(String[] args) {
        Stream<String> stream= Stream.of("A","B","C");
        Map<String, Integer> result = stream.collect(Collectors.toMap(s -> s, String::length));
        result.forEach((key,value)-> System.out.println(key+":"+value));

        Stream<String> stream2= Stream.of("A","B","C","A");
        Map<String, Integer> result2 = stream2.collect(Collectors.toMap(s -> s, String::length,(s1,s2)->s1+s2));
        result2.forEach((key,value)-> System.out.println(key+":"+value));

    }
}
