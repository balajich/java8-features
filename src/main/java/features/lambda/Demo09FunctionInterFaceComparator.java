package features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/***
 * Using function interface comparator
 */
public class Demo09FunctionInterFaceComparator {
    public static void main(String[] args) throws InterruptedException {
        //Create a anonymous comparator class and initialize it
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Compare two strings based on their length
                return Integer.compare(s1.length(), s2.length());
            }
        };

        //Create a list of Strings
        List<String> list = Arrays.asList("***", "**", "****", "*");

        //Sort list in ascending order
        Collections.sort(list, comparator);

        //Print list
        for (String s : list) {
            System.out.println(s);
        }
    }
}
