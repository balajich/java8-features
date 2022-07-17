package exam;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferencesDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Consumer<List<String>> consumer=Collections::sort; //static method
        List<String> stringList= Arrays.asList("A","D","B");
        consumer.accept(stringList);
        System.out.println(stringList);

        //Instance methods on particular object
        String str="HelloWorld";
        Function<String,Integer> indexOf=str::indexOf;
        System.out.println(indexOf.apply("W"));
        Predicate<String> startsWith=str::startsWith;
        System.out.println(startsWith.test("s"));
        Random random= new Random();
        Supplier<Integer> randomSupplier=random::nextInt;
        randomSupplier.get();

        //Calling instance methods on Parameter
        Predicate<String> stringPredicate=String::isBlank;
        System.out.println(stringPredicate.test(""));
        Function<String,String> functionToUpperCase=String::toUpperCase;
        System.out.println(functionToUpperCase.apply("demo"));

        //Calling Constructors
        Supplier<List<String>> listSupplier= ArrayList::new;
        System.out.println(listSupplier.get());

        Function<Integer,List<String>> listSupplierFunction= ArrayList::new;
        System.out.println(listSupplierFunction.apply(1));

        Thread thread1= new Thread(()-> System.out.println("Hello"));
        thread1.start();
        thread1.join();

        Thread thread2= new Thread(System.out::println);
        thread2.start();
        thread2.join();



    }
}
