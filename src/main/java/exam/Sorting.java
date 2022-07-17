package exam;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(List.of("A","C","D","B"));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,String::compareTo);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        int arr[]={4,3,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));




    }
}
