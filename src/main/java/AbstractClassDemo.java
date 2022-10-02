interface Printer{
    abstract  void print();
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Printer printer=()-> System.out.println("Hello World");
        printer.print();
    }
}
