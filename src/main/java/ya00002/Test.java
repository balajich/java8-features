package ya00002;

import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        List<String> fruits= List.of("A","B","C","D");
        //Optional<String> result = fruits.stream().filter(e -> e.contains("C")).findAny();
        //it may produce different result
        Optional<String> result = fruits.parallelStream().filter(e -> e.contains("C")).findAny();
        if(result.isPresent()){
            System.out.println(result.get());
        }else{
            System.out.println("Didn't find any thing");
        }
    }
}
