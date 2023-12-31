package lambda;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
//        Consumer<String> consume= s-> System.out.println(s);
//        consume.accept("Hello World");
//        Supplier<String> supplier=()->"Hello";
//        System.out.println(supplier.get());
//        Predicate<String> predicate=s->s.isEmpty();
//        predicate.test("s");
//        Function<String,String> fun=(s)->s;
//        fun.apply("Hello");
//        BiFunction<String,String,String> fun1=(s1,s2)-> s1+s2;
//        System.out.println(fun1.apply("A","B"));
//        List.of("A","B","C").stream().forEach(System.out::println);
//        Stream.of("A", "B", "C").map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);
        //List.of("A","A","B").stream().collect(Collectors.toSet()).forEach(System.out::println);
        List.of("A","A","B").stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).forEach((k,v)-> System.out.println(k+": "+v));

    }
}
