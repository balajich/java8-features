package UKOCP46093;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
 
interface StringConsumer extends Consumer<String> {

    public default void accept1(String s) {
        System.out.println(s.toUpperCase());
    }
}
 
public class Test {
    public static void main(String[] args) {
        StringConsumer consumer = s -> System.out.println(s.toLowerCase());
        List<String> list = Arrays.asList("Dr", "Mr", "Miss", "Mrs");
        list.forEach(consumer);
    }
}