package UKOCP82153;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
 
class Counter {
    static int count = 1;
}
 
public class Test {
    public static void main(String[] args) {
        /*Consumer<Integer> add = i -> Counter.count += i;
        Consumer<Integer> print = System.out::println;
        add.andThen(print).accept(10); //Line n1*/
        /*Consumer<Integer> inc= j->{j=j+1;
            System.out.println(j);};
        inc.andThen(inc).andThen(inc).accept(10);*/
        final List<Integer> list=new ArrayList<>();
        Consumer<Integer> push= list::add;
        push.andThen(push).andThen(push).accept(10);
        System.out.println(list);

    }
}