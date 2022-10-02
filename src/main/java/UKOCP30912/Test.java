package UKOCP30912;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
 
public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList (2, 3, 4);
        UnaryOperator<Integer> operator = s -> s*s*s;
        list.replaceAll(i->i*i);
        list.forEach(System.out::println);
    }
}