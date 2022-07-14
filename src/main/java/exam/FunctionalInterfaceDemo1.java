package exam;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo1{
    public static void main(String[] args) {
        Predicate<Integer>predicate1=(Integer i ) -> i>0;
        predicate1.test(10);

        Predicate<Integer>predicate2= i  -> i>0;
        predicate2.test(10);

        Predicate<Integer>predicate3= (i)  -> i>0;
        predicate3.test(10);

        Predicate<Integer>predicate4= (Integer i)  -> i>0;
        predicate4.test(10);

//        Predicate<Integer>predicate5= Integer i  -> i>0;
//        predicate5.test(10);

        Predicate<String>predicate5= (s)  -> Integer.parseInt(s)>0;
        System.out.println(predicate5.test("10"));
        System.out.println(predicate5.test("10e"));



    }
}
