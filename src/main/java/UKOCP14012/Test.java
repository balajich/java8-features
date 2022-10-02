package UKOCP14012;

interface Writer {
    void print(Object obj);
}
 
public class Test {
    public static void main(String[] args) {
        Writer obj = System.out::print;
        obj.print("BE HONEST");
    }
}