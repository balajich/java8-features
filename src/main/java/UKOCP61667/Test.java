package UKOCP61667;

import java.util.ArrayList;
import java.util.List;
 
public class Test {
    public static void main(String[] args) {
        Integer i = 10;
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(i *= 2);
        list.add(i);
 
        list.removeIf(j -> j == 10);
 
        System.out.println(list);
    }
}