package ya00012;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //List of makes immutable list, So create a mutable array list
       List<String> list=new ArrayList<>(List.of("A","B"));
       list.sort(new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o2.compareTo(o1);
           }
       });
        System.out.println(list);
    }

}
