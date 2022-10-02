package UKOCP82131;

import java.util.*;
 
public class Test {
    public static void main(String[] args) {
        var map = new LinkedHashMap<String, String>();
        map.put("1",  null);
        map.put("2",  "John");
        map.put("3", "Evelyn");
        map.merge("1", "Harper", String::concat); //Line n1
        map.merge("2", "Lucy", String::concat); //Line n1
//        map.merge("2", "Lucy", (s1, s2) -> s2 + ":" + s1); //Line n2
//        map.merge("3", "Juliet", (s1, s2) -> s1.concat(":").concat(s2)); //Line n3
        System.out.println(map);
        //System.out.println("a".concat(null));
    }
}
