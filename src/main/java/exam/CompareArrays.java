package exam;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int[] arr1={1,2},arr2={1,2};
        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2)); //These are not equals
        System.out.println(Arrays.equals(arr1,arr2));//compare
        int arr3[]={2,1};
        System.out.println(Arrays.equals(arr1,arr3));//Not equals and order matters
    }

}
