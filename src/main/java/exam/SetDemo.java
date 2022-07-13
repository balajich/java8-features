package exam;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> stringSet= new HashSet<>();
        stringSet.add("A");
        stringSet.add("A");
        stringSet.add("B");

        System.out.println(stringSet);
        System.out.println(stringSet.remove("D"));
        System.out.println(stringSet.isEmpty());
        System.out.println(stringSet.size());

    }
}
