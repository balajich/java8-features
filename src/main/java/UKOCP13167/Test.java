package UKOCP13167;
interface F{
String sb(String s,Integer i);
}
public class Test {
    public static void main(String[] args) {
        F f=String::substring;
        System.out.println(f.sb("Hello",1));

    }
}
