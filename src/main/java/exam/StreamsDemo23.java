package exam;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

/**
 * Checked Exceptions
 */
public class StreamsDemo23 {
    static List<String> create() throws IOException{
        throw new IOException();
    }
    public static void main(String[] args) throws IOException {
        //exam.StreamsDemo23.create().stream().forEach(System.out::println);

        //Supplier<List<String>> supplier=exam.StreamsDemo23::create;
        Supplier<List<String>> supplier=StreamsDemo23::createSafe;
        supplier.get();
    }
    static List<String> createSafe() throws RuntimeException{
        try{
            return create();
        }catch (IOException ioe){
            throw  new RuntimeException();
        }
    }
}
