package scrape;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("A","E","B");
        //List<String> result = list.stream().collect(Collectors.toList());
//        Set<String> result = list.stream().collect(Collectors.toSet());
//        System.out.println(result);
        //Map<String, Integer> result = list.stream().collect(Collectors.toMap(Function.identity(), e -> e.length()));
        //Map<String, Integer> result = list.stream().collect(Collectors.toMap(Function.identity(), String::length));
        Map<String, Integer> result = list.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(result);
        
    }
}
