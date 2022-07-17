package exam;

import java.util.function.Supplier;

public class MethodReferencesDemo1 {
    public static void main(String[] args) {
        Supplier<Double> supplier=()->Math.random();
        System.out.println(supplier.get());
         supplier=Math::random;
        System.out.println(supplier.get());

        Supplier<String> supplier1=()->new String();
        System.out.println(supplier1.get());
        supplier1=String::new;
        System.out.println(supplier1.get());

    }
}
