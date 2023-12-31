package exercises.strings;

//  program to find the first and the last occurrence of the letter 'o' and character ',' in "Hello, World"
public class Exercise17 {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println("First Occurrence: "+str.indexOf('o'));
        System.out.println("Last Occurrence: "+str.lastIndexOf('o'));
    }
}
