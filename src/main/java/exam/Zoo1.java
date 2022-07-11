package exam;

import java.util.Arrays;
import java.util.List;

public class Zoo1 {
    public static void main(String... args) {
        String arr[]=new String[]{"A","B"};
        printArray(arr);
    }
    private static void printArray(String... arr){
        for(String e:arr){
            System.out.println(e);
        }
    }
}
