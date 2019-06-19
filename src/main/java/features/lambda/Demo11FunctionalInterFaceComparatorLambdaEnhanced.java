package features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * Using function interface comparator
 */
public class Demo11FunctionalInterFaceComparatorLambdaEnhanced {
    public static void main(String[] args) throws InterruptedException {
        //Create a list of Strings
        List<String> list = Arrays.asList("***", "**", "****", "*");

        //Sort list in ascending order using lambda expression of comparator
        // No need to specify the data types of varaiables s1 and s2
        Collections.sort(list, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //Print list
        for (String s : list) {
            System.out.println(s);
        }
    }
}
