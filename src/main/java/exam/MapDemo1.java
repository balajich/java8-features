package exam;

import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap= Map.of(1,"Alex",2,"Stan");
        for(Integer key:studentMap.keySet()){
            System.out.println(key+" "+studentMap.get(key));
        }
        studentMap.forEach((k,v)->System.out.println(k+v));

    }
}
