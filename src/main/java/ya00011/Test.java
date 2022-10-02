package ya00011;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.BiPredicate;

public class Test {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> test=(var x, var y)->x.equals(y); //correct
        //Incorrect, Shouldn't mix var and explicit typed parameters
        //BiPredicate<Integer,Integer> test1=(var x, Integer y)->x.equals(y);
        //BiPredicate<Integer,Integer> test1=(final Integer x, var y)->x.equals(y);
        BiPredicate<Integer,Integer> test1=(x, y)->x.equals(y); // correct
        //BiPredicate<Integer,Integer> test2=(var x, y)->x.equals(y);//Incorrect
        BiPredicate<Integer,Integer> test4=(final Integer x,Integer y)->x.equals(y); // correct
    }
}
