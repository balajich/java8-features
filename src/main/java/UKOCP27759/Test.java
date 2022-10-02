package UKOCP27759;

import java.util.ArrayList;
import java.util.List;
 
public class Test {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("AAA")); //Line n1
        list.add(new StringBuilder("BBB")); //Line n2
        list.add(new StringBuilder("AAA")); //Line n3
 
        list.removeIf(s->s.equals("AAA")); //Line n4
        System.out.println(list);
    }
}