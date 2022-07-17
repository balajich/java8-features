package exam;

public class GenericDemo3 {
    static interface Printer<T>{
        void print(T t);
    }
    static class DotPrinter<T> implements Printer<T>{

        @Override
        public void print(T t) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Printer<String> dotPrinter= new DotPrinter<>();
        dotPrinter.print("Hello World");
    }


}
