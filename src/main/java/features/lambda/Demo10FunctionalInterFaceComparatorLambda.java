package features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * Using function interface comparator
 */
public class Demo10FunctionalInterFaceComparatorLambda {
    public static void main(String[] args) throws InterruptedException {
        //Create a list of Strings
        List<String> list = Arrays.asList("***", "**", "****", "*");

        //Sort list in ascending order using lambda expression of comparator
        Collections.sort(list, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));

        //Print list
        for (String s : list) {
            System.out.println(s);
        }
    }
}
