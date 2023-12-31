package exercises.strings;

// Write a Java program to get the character (Unicode code point) before the specified index within the String
public class Exercise3 {
    public static void main(String[] args) {
        String input="abc";
        int specifiedIndex=0;
        System.out.println(input.codePointAt(specifiedIndex+1));
    }
}
