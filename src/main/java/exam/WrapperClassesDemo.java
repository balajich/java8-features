package exam;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        Integer i1=10;//Autoboxing
        Integer i2= Integer.valueOf(10);
        System.out.println(i1==i2);

        //Convert String to int
        int i3=Integer.parseInt("10");
        //int i4=Integer.parseInt("abc");//Throws number format exception

        //Adding elements
        List<Integer> listInts= new ArrayList<>();
        listInts.add(1);
        listInts.add(Integer.valueOf("2"));
        listInts.add(null);

        int index0=listInts.get(0);
        Integer index1=listInts.get(1);
        Integer _index2=listInts.get(2);//No issue
        System.out.println(_index2);
        int index2=listInts.get(2);//This will cause null pointer exception










    }

}
