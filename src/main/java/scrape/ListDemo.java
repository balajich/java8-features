package scrape;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,0);
        list.add(0,9);
        list.sort(Integer::compareTo);
        list.forEach(System.out::println);
        list.sort((e1,e2)->e2.compareTo(e1));
        System.out.println(list.contains(-5));
        System.out.println(list);
        list.remove(3);
        list.remove(Integer.valueOf(9));
        System.out.println(list);

    }
}
