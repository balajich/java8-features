package exam;

import java.util.List;
import java.util.concurrent.Executor;

public class StreamParallel {
    public static void main(String[] args) {
        //List.of(1,2,3).stream().map(i->i+1).forEach(System.out::println);
        //List.of(1,2,3).stream().parallel().map(i->i+1).forEach(System.out::println);

        //System.out.println(List.of(1,2,3).stream().parallel().findAny().get());
       // System.out.println(List.of(1,2,3).stream().parallel().findAny().get());

        String result = List.of('W', 'o', 'l', 'f').stream().parallel().reduce("", (s1, c) -> s1 + c, (s1, s2) -> s1 + s2);
        System.out.println(result);

    }
}
