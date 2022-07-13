package exam;

import java.util.Arrays;
import java.util.List;

public class OverloadingGenerics {
    public void print(List<String> list){
        System.out.println(list);
    }
//    public void print(List<Integer> list){
//        System.out.println(list);
//    }
    public void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public void print(Integer[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        OverloadingGenerics ol= new OverloadingGenerics();
        ol.print(List.of("A","B"));
        ol.print(new int[2]);
        ol.print(new Integer[3]);
    }
}
