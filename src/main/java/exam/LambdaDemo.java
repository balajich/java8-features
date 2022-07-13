package exam;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        Consumer<String> t= s -> System.out.println(s);
        t.accept("Hello");
        MyConsumer t1 = s -> System.out.println(s);
        t.accept("Hello");
        List<String> stringList= List.of("1","ABC"," ","","123");
        print(stringList,s->!s.trim().isEmpty());
        print(stringList,s->s.trim().isEmpty());
    }
    static void print(List<String> stringList, Predicate<String> condtion){
        for(String s:stringList){
            if(condtion.test(s)){
                System.out.println(s);
            }
        }
    }

}
