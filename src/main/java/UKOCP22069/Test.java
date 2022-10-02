package UKOCP22069;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Test {
    public static void main(String[] args) {
//        StringBuilder [] arr = {new StringBuilder("A"), new StringBuilder("A")};
//        List<StringBuilder> list = Arrays.asList(arr);
////        for(int i = 0; i < 2; i++)
////            if(i == 0)
////                list.forEach(sb -> sb.append("B"));
////            else
////                list.forEach(sb -> sb.append("C"));
////
//        list.forEach(sb -> System.out.println(sb));
        List<StringBuilder> list= new ArrayList<>();
        list.add(new StringBuilder("A"));
        list.add(new StringBuilder("B"));
        list.add(new StringBuilder("c"));

        //list.forEach(System.out::println);
        list.forEach(s->s.append("A"));
        list.forEach(System.out::println);
    }
}
