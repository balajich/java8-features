package exam;

import java.util.Locale;
import java.util.function.*;

public class FunctionInterfacesDemo {
    public static void main(String[] args) {
        //Supplier
        Supplier<String> supplier=()->"HelloWorld";
        supplier.get();

        //Consumer
        Consumer<String> consumer=(s)-> System.out.println(s);
        consumer.accept("Hello World");

        //BiConsumer
        BiConsumer<String,String> biConsumer=(t,u) -> System.out.println(t+u);
        biConsumer.accept("Hello","World");

        //Predicate
        Predicate<String> predicate=(s)->s.isEmpty();
        predicate.test("Hello World");

        //Bi-Predicate
        BiPredicate<String,String> biPredicate= (t,u) ->t.isEmpty() && u.isEmpty();
        biPredicate.test("Hello","World");

        //UnaryOperator
        UnaryOperator<String> unaryOperator= s->s.toLowerCase();
        unaryOperator.apply("Hello World");
    }
}
