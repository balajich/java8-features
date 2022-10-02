package UKOCP46039;

import java.util.*;
 
public class Test {
    public static void main(String[] args) {
        String [] arr = {"EARTH", "MOON", "SUN", "PLUTO"};
        //var list = Arrays.asList(arr);
        var list = new ArrayList<>(List.of(arr));
        list.set(3, "JUPITER"); //Line n1
        list.forEach(str -> System.out.println(str)); //Line n2
    }
}