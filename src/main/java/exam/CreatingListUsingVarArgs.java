package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreatingListUsingVarArgs {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("A","B");
        List<String> list2=List.of("A","B");
        List<String> list3= Arrays.asList(new String[]{"A","B"});
        //All of the above create immutable list
        //list1.add("C");
       // list2.add("C");
        //list3.add("C");
        //Creating mutablelist
        List<String> list4= new ArrayList<>(List.of("B","A"));
        list4.add("C");
        System.out.println(list4);

        //Sorting array
        Collections.sort(list4);
        System.out.println(list4);

    }
}
