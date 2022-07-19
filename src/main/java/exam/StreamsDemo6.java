package exam;

import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo6 {
    public static void main(String[] args) {
        Stream<String> stream1=Stream.of("A","B","C","D");
        String result=stream1.reduce("",(s1,s2)->s1+s2);
        System.out.println(result);

        stream1=Stream.of("A","B","C","D");
        result=stream1.reduce("",String::concat);
        System.out.println(result);

        Stream<Integer> factorialStream=Stream.of(1,2,3,4);
        Integer result2=factorialStream.reduce(1,(a,b)->a*b);
        System.out.println(result2);


    }
}
