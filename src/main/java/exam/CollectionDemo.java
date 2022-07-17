package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("A", "", "C", " "));
        stringList.add(null);
        stringList.removeIf(Objects::isNull);
        stringList.removeIf(String::isBlank);
        System.out.println(stringList);
        stringList.forEach(System.out::println);
    }
}
