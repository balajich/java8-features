package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap= new HashMap<>();
        studentsMap.put(1,"Alex");
        studentsMap.put(2,"Stan");

        System.out.println(studentsMap);
        System.out.println(studentsMap.size());

        //Search
        System.out.println(studentsMap.containsKey(1));
        System.out.println(studentsMap.containsValue("Balaji"));

        //Get or default
        System.out.println(studentsMap.getOrDefault(10,"Unknown"));

        //iterate through map
        for(Integer key:studentsMap.keySet())
            System.out.println(key+":"+studentsMap.get(key));

    }
}
