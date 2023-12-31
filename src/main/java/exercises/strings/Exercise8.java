package exercises.strings;

//  Java program to compare a given string to the specified string buffer
public class Exercise8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Hello World".contentEquals(sb));
    }
}
