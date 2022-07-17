package exam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencesDemo2 {
    public static void main(String[] args) {
       int arr[]={1,3,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Consumer<Integer[]> consumer= (inarr)->Arrays.sort(inarr);
        Consumer<Integer[]> consumer= Arrays::sort;
        Integer[] arr1={1,3,2};
        consumer.accept(arr1);
        System.out.println(Arrays.toString(arr1));

        Function<String[],List<String>> function= List::of;
        System.out.println(function.apply(new String[]{"A","B","C"}));


    }
}
