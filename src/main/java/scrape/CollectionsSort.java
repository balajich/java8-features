package scrape;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
        List<Apple> listApples= Arrays.asList(new Apple(3),new Apple(1),new Apple(2));
        System.out.println(listApples);
        //Print apple with weights
        listApples.stream().forEach(e-> System.out.println(e.getWeight()));
        listApples.stream().parallel().forEach(System.out::println);

        //Sort Apples list by size
        Collections.sort(listApples,(e1,e2)->e1.getWeight().compareTo(e2.getWeight()));
        System.out.println(listApples);
        printApples(listApples);
   }
   private  static void printApples(List<Apple> appleList){
        appleList.forEach(e-> System.out.println(e.getWeight()));
   }
}
