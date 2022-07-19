package exam;

import java.util.List;
import java.util.stream.Stream;

/**
 * Creating Streams
 */
public class StreamsDemo1 {
    public static void main(String[] args) {
        Stream<String> empty= Stream.empty();
        Stream<Integer> singleElement= Stream.of(1);//Stream with two elements
        Stream<Integer> fromArray=Stream.of(1,2,3); // Stream with Three elements

        //Finite Streams for collections
        List<String> stringList= List.of("A","B","C");
        Stream<String> stream=stringList.stream();

        //Infinite Streams
        Stream<Double>randoms=Stream.generate(Math::random);
        Stream<Integer> oddNumbers=Stream.iterate(1,n->n+2);
        Stream<Integer> oddNumbersLessThan100=Stream.iterate(1,n-> n<100,n->n+2);


    }
}
