package scrape;

import java.util.*;

public class FindUniqueCharsInString {
    public static void main(String[] args) {

        //Converting String to Chars list
        String str="Hello World";
        char[] chars = str.toCharArray();
        List<Character> listChars= new ArrayList<>();
        for(Character c: chars){
            listChars.add(c);
        }

        //Unique Chars
        Set<Character> setUniqueChars= new HashSet<>();
        //Filter empty chars
        listChars.stream().filter(e-> !e.toString().trim().isEmpty()).forEach(e-> setUniqueChars.add(e));
        System.out.println(setUniqueChars);

    }
}
