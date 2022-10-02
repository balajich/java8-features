package UKOCP74523;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<StringBuilder> supplier=()-> new StringBuilder("Hello").reverse().append("World").reverse();
        System.out.println(supplier.get());
    }
}
