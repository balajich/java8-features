package exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionInterfaceDemo1 {
    public static void main(String[] args) {
        Consumer<String> consumer1=(String s)-> System.out.println(s);
        consumer1.accept("Hello World");

        Consumer<String> consumer2=System.out::println;
        consumer2.accept("Hello World");

        var map= new HashMap<Integer,String>();
        BiConsumer<Integer,String> biConsumer1= (key,value) -> map.put(key,value);
        biConsumer1.accept(1,"Alex");
        BiConsumer<Integer,String> biConsumer2= map::put;
        biConsumer2.accept(2,"Stan");
        System.out.println(map);
    }
}
