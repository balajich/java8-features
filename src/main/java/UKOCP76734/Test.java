package UKOCP76734;

interface F{
    void print(Number n);
}

interface F1{
    void print(String s);
}
public class Test {
    public static void main(String ... args){
        F f = System.out::println;
        f.print(10.2);
        F1 f1=String::toUpperCase;
        f1.print("balaji");
        F1 f2=String::isBlank;
        f2.print("sss");
    }

}
