package exam;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceDemo3 {
    public static void main(String[] args) {
        Function<String,Integer> function1=String::length;
        System.out.println(function1.apply("Hello World"));

        BiFunction<String,String,String> biFunction=String::concat;
        System.out.println(biFunction.apply("A","B"));

    }
}
