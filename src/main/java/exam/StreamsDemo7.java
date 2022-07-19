package exam;

import java.util.stream.Stream;

/**
 * Common Stream operations
 */
public class StreamsDemo7 {
    public static void main(String[] args) {
        System.out.println(Stream.of(1,2,3,4).reduce(1,(a,b)->a*b));
        Stream.of(1,2,3).reduce((a,b)->a*b).ifPresent(System.out::println);
        Stream.of(1).reduce((a,b)->a*b).ifPresent(System.out::println);

        //Count of letters in words
        System.out.println(Stream.of("A","B","C","DE").reduce(0,(i,s)->i+s.length(),(i,j)->i+j));


    }
}
