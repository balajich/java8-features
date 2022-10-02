package UKOCP50556;
interface Printer{
    void print(String s);
}
class MyPrinter{
    MyPrinter(String s){
        System.out.println("I am in construction");
        System.out.println(s);
    }
}
public class Test {
    public static void main(String[] args) {
        Printer p= MyPrinter::new;
         p.print("Hello");

    }
}
