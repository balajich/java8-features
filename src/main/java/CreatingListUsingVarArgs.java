import java.util.Arrays;
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

    }
}
