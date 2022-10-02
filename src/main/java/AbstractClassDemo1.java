interface Printer1{
    abstract  void print();
    default void hello(){
        System.out.println("I am hello");
    }
}

public class AbstractClassDemo1 {
    public static void main(String[] args) {
        Printer1 printer=()-> System.out.println("Hello World");
        printer.print();
        printer.hello();
    }
}
