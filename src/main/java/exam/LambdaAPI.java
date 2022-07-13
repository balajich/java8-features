package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaAPI {
    public static void main(String[] args) {
        //Remove elements
        List<String> stringList = new ArrayList<>(List.of("A", "B", "C"));
        stringList.removeIf(s -> s.startsWith("A"));
        System.out.println(stringList);

        //Sort
        List<String> stringList1 = new ArrayList<>(List.of("A", "D", "B"));
        stringList1.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(stringList1);

        //ForEach
        List<String> stringList2 = List.of("A", "B", "D");
        stringList2.forEach(s -> System.out.println(s.toLowerCase()));

        //Biconsumer
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Alex");
        studentMap.put(2, "Stan");
        studentMap.forEach((k, v) -> System.out.println(k + ":" + v));

        //Sort using Comparator
        List<String> stringList3= new ArrayList<>(List.of("A","B"));
        stringList3.sort((s1,s2)->-s1.compareTo(s2));
        System.out.println(stringList3);
    }
}
