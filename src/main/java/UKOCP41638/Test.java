package UKOCP41638;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer,Integer> incBy10= x->x+10;
        Function<Integer,Integer> incBy20= x->x+20;
        Function<Integer, Integer> incBy10and20 = incBy10.compose(incBy20);
        System.out.println(incBy10and20.apply(10));
        System.out.println(incBy10.andThen(incBy20).apply(10));


    }
}
