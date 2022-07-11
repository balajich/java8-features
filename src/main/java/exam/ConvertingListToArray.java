package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingListToArray {
    public static void main(String[] args) {
//        List<String> listStr= new ArrayList<>();
//        listStr.add("A");
//        listStr.add("B");
//        listStr.add("C");
//        Object[] arrObj=listStr.toArray();//Converts to Objects
//        String[] arrStr=listStr.toArray(new String[0]);
//        System.out.println(Arrays.toString(arrObj));
//        System.out.println(Arrays.toString(arrStr));

        //Edge cases

        String[] arr={"A","B"};
        List<String> listStr= Arrays.asList(arr);
        //Print Array
        System.out.println(Arrays.toString(arr));
        //Print List
        System.out.println(listStr);
        //Modify Array
        arr[0]="A1";

        //print array and list
        System.out.println(Arrays.toString(arr));
        System.out.println(listStr);

        //Try to remove an element from list
        //listStr.remove(0);//This should give exception

        //Try to add element to list
        //listStr.add("C");//This should throw exception

        //Try to update an element
        listStr.set(1,"B1");//No problem . you are not altering dimensions

        //Print list and array
        System.out.println(Arrays.toString(arr));
        System.out.println(listStr);

       //Try to access array beyond boundary.
        //arr[2]="C";//Not allowed.










    }
}
