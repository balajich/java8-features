package exercises.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Sort String Array in decreasing order
public class Exercise6 {
    public static void main(String[] args) {
       String arr[]={"Ram","Alex","Zeena"};
        List<String> result = Arrays.stream(arr).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
