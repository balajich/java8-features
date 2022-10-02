package UKOCP87835;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<char[],String> fun=String::new;
        String result = fun.apply(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(result);


    }
}
