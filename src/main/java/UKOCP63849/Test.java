package UKOCP63849;

import java.util.List;
 
public class Test {
    public static void main(String[] args) {
        var festivals = List.of("DIWALI", "CHRISTMAS", "EID");
        festivals.removeIf(str -> str.length() == 3);
        System.out.println(festivals);
    }
}