package exam;

import java.util.function.*;

public class FunctionInterfaceDemo6 {
    public static void main(String[] args) {
        Predicate<String> brown=s->s.contains("brown");
        Predicate<String> eggs=s->s.contains("eggs");
        System.out.println(brown.test("brown eggs") && eggs.test("brown eggs"));
        System.out.println(brown.and(eggs).test("brown eggs"));
        Consumer<String> print=System.out::print;
        Consumer<String> printTwise=(s)->{ System.out.println(s);System.out.println(s); };
        print.andThen(printTwise).accept("HelloWorld.. Three times");

        Function<Integer,Integer> square= n -> n*n;
        System.out.println(square.andThen(square).apply(2));

        Function<Integer,Integer> add2= n->n+2;
        Function<Integer,Integer> mul2= n-> n*2;
        Function<Integer, Integer> mul2add2 = add2.compose(mul2);
        System.out.println(mul2add2.apply(2));



    }
}
