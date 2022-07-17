package exam;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo6 {
    public static void main(String[] args) {
        List<?> x1= new ArrayList<>();
        var x2= new ArrayList<>();
        x1=x2;//This should be fine

        List<Integer> x3= new ArrayList<>();
                //x2=x3;//This will cause issue
    }

}
