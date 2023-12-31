package scratch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        list.forEach(System.out::println);
        // This will filter all the elements
        Stream<Integer> integerStream = list.stream().filter(PredicateExample::returnTrue);
        integerStream.forEach(System.out::println); //empty out put
        Stream<Integer> integerStream1 = list.stream().filter(PredicateExample::returnFalse);
        integerStream1.forEach(System.out::println);

        //filters all the element , passing anonymous function
        list.stream().filter(x->true).forEach(System.out::println);
        //doesn't filter anything
        list.stream().filter(x->false).forEach(System.out::println);



    }



    public static boolean returnTrue(Integer integer)
    {
        return  true;
    }

    public static boolean returnFalse(Integer integer){
        return  false;
    }
}
