package UKOCP37119;

interface Printable {
    void print(Printer p1, Printer p2);
}
 
class Printer {
    public static void printStatic(Printer p1, Printer p2) {
        System.out.println(p1.toString() + "$$" + p2.toString());
    }
    
    public void print(Printer p1) {
        System.out.println(p1.toString());
    }
    
    public String toString() {
        return "Hello";
    }
}
 
 
public class Test {
    public static void main(String[] args) {
        Printable obj = Printer::print;
        obj.print(new Printer(), new Printer());
    }
}