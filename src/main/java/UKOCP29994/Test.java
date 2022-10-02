package UKOCP29994;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<Date> dateSupplier= Date::new;
        System.out.println(dateSupplier.get());
        Predicate<String> stringPredicate=s->s.contains("a");
        Predicate<String> stringPredicate2 = stringPredicate.and(s -> s.contains("b"));
        System.out.println(stringPredicate2.test("a"));

         Function<Integer,Integer> square= n->n*n;
//        Function<Integer, Integer> squareAndCube = square.andThen(n -> n * n * n);
//        System.out.println(squareAndCube.apply(2));

        Function<Integer, Integer> squareAndCube = square.compose((Integer n) -> n * n * n);
        System.out.println(squareAndCube.apply(2));
        final boolean state=true;
        Predicate<String> helloPredicate=s-> {return state;};




    }
}
