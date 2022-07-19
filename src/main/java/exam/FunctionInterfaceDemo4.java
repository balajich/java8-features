package exam;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceDemo4 {
    @FunctionalInterface
    static interface TriFun<T,U,V,R>{
        R apply(T t,U u,V v);
    }
    public static void main(String[] args) {
        TriFun<String ,String,String,String> triFun=(t,u,v)->t+u+v;
        System.out.println(triFun.apply("A","B","C"));

    }
}
