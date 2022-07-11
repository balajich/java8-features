package scrape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class LoopListJava8 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add(null);
//        list.add("D");
//        list.add("E");
//        //print non null elements
//        list.stream().filter(Objects::nonNull).forEach(System.out::println);

        List<String> list = Arrays.asList("abc", "java", "python");
        List<String> hexaList= new ArrayList<>();
        Consumer<String> textToHex=(str)->{
            StringBuilder sb= new StringBuilder();
            for(char c:str.toCharArray()){
                sb.append(Integer.toHexString(c));
            }
            hexaList.add(sb.toString());
        };
        list.forEach(textToHex);
        System.out.println(hexaList);



    }
}
