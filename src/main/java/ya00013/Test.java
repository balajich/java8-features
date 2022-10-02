package ya00013;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
       List<String>list=List.of("C","B","A");
        Stream<String> s1 = list.stream();
        String result = s1.peek(System.out::print)
                .sorted()
                .peek(System.out::print)
                .collect(Collectors.joining(","));
        System.out.println(result);

    }

}
