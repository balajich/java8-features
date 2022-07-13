package exam;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortComparator {
    public static void main(String[] args) {
        Integer arr1[]={3,4,1};
        Comparator<Integer> inc = (i1, i2) -> i1 - i2;
        Comparator<Integer> dec = (i1, i2) -> i2 - i1;
        Arrays.sort(arr1,inc);
        System.out.println(Arrays.toString(arr1));

        Integer arr2[]={3,4,1};
        Arrays.sort(arr2,dec);
        System.out.println(Arrays.toString(arr2));







    }
}
