package exam;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionInterfaceDemo5 {
    public static void main(String[] args) {
        UnaryOperator<String> stringUnaryOperator=String::toUpperCase;
        System.out.println(stringUnaryOperator.apply("hello world"));

        BinaryOperator<String> binaryOperator=String::concat;
        System.out.println(binaryOperator.apply("abc","xyz"));

    }
}
