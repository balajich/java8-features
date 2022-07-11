package scrape;

import java.util.HashMap;
import java.util.Map;

public class LoopMapJava8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put(null, 40);
        map.put("E", null);
        map.put("F", 60);

        map.forEach((String k, Integer v) -> System.out.println(k+""+v));

    }


}
