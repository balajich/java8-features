package list;

import java.util.ArrayList;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        //list.add("D");

        List<String> l1= new ArrayList<>();
        l1.add("A");
    }
}
