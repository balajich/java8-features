package ya00056;

import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

@FunctionalInterface
interface I1{
void show();
}
public class Test {
    static String random(){
        return "Hello";
    }
    public static void main(String[] args) {
        I1 i1=()-> System.out.println("Hello");
        I1 i2=()->{};
        i1.show();
        i2.show();
        Predicate<String> p=String::isBlank;
        System.out.println(p.test("abc"));
        System.out.println(p.test(""));

        Consumer<String> con=System.out::println;
        con.accept("A");

        Supplier<String> stringSupplier= Test::random;
        System.out.println(stringSupplier.get());
        String s=null;
        Optional<String> result = Optional.ofNullable(s);
        System.out.println(result.isPresent());
        //System.out.println(result.get());
        result.ifPresent(System.out::println);

        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.filter(i->i>0).peek(System.out::println).count());
        //stream.forEach(System.out::println);


    }

}