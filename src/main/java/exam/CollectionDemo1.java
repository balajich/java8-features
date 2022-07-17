package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CollectionDemo1 {
    public static void main(String[] args) {
       List<String> list= Arrays.asList("a","b","C");
       list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
}
