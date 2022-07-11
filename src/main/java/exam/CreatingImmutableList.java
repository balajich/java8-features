package exam;

import java.util.Arrays;
import java.util.List;

public class CreatingImmutableList {
    public static void main(String[] args) {
        String[] arr={"A","B"};
        List<String> list= List.of(arr);
        //list.set(0,"A1");//This will throw exception

        //Print Array and list
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        //Try to change are add element in list
        //list.set(0,"A1"); //Throws Exception
        //list.add("C1");// Throws Exception
        arr[0]="A1" ;//This won't change underneath list
        System.out.println(Arrays.toString(arr));
        System.out.println(list);




    }
}
