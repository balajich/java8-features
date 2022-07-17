package exam;

import java.util.List;

public class GenericDemo5 {
    public static void main(String[] args) {
        List<String> stringList= List.of("A","B");
        print(stringList);
        List<Integer> integerList=List.of(1,2,3);
        print(integerList);
    }
    private static void print(List<?> elements){
        for (Object x:elements){
            System.out.println(x);
        }
    }

}
