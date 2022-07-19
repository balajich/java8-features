package exam;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionInterfaceDemo2 {
    public static void main(String[] args) {
        Predicate<String> stringPredicate= String::isEmpty;
        System.out.println(stringPredicate.test(" "));
        System.out.println(stringPredicate.test(""));

        Predicate<String> stringPredicate1= Objects::isNull;
        System.out.println(stringPredicate.test(" "));

        BiPredicate<String,String> biPredicate= (s1,s2)->s1.startsWith(s2);
        System.out.println(biPredicate.test("ALex","A"));

        BiPredicate<String,String> biPredicate1= String::startsWith;
        System.out.println(biPredicate.test("ALex","A"));




    }
}
