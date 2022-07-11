package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {

    public static void main(String[] args) {
//        List<String> listStr= Arrays.asList("A","B","C");
//        for(String s:listStr)
//            System.out.println(s);
//        var listStr= Arrays.asList("A","B","C");
//        for(String s:listStr)
//            System.out.println(s);

        //List<String> listStr= new ArrayList<String>();
        //List<String> listStr= new ArrayList<>();
//        var listStr= new ArrayList<>();
//        for(Object s:listStr)
//            System.out.println(s);
//        List<String> arrayList= new ArrayList<>();
//        arrayList.add("coco");
//        arrayList.add(0,"seagull");
//        arrayList.add(0,"buck");
//        for(String e:arrayList){
//            System.out.println(e);
//        }
//        System.out.println(arrayList.remove("buck"));
//        System.out.println(arrayList);
//
//        System.out.println(arrayList.remove("crow"));
//
//        //change element at index
//        arrayList.set(0,"seagull updated");
//        System.out.println(arrayList);
//
//        //Searches for element
//        System.out.println(arrayList.contains("coco"));

        //Array lists
        List<String> list1= new ArrayList<>();
        list1.add("A");list1.add("A2");

        List<String> list2= new ArrayList<>();
        list2.add("A");list2.add("A2");

        System.out.println(list1.equals(list2));
        //change order
        list2.set(0,"A2");
        list2.set(1,"A1");
        System.out.println(list1.equals(list2));




    }
}
