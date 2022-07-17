package exam;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo7 {
    public static void main(String[] args) {
         List<? extends Number> integerList= List.of(1,2,3);
         printNumber(integerList);

         integerList= List.of(1.1,2.2,3.2);
         printNumber(integerList);

         List<Float> floatList=List.of(1.2f,2.3f,4.2f);
         printNumber(floatList);

    }
    private static void printNumber(List<? extends Number> numbers){
        for(Number number:numbers){
            System.out.println(number);
        }
    }

}
