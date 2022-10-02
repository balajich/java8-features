package UKOCP83498;

interface Operator<T> {
    T operate(T t);
}
interface Printer<T>{
    void print(T t);
}

class MyPrinter<T> implements Printer<T>{

    @Override
    public void print(T t) {
        System.out.println(t);
    }
}
 
public class Test {
    public static void main(String[] args) {
        //String s= new String();
        //Operator<String> opr =  s -> s.toUpperCase(); //Line n1
        //Operator<String> opr =  String::toUpperCase; //Line n1
        Operator<String> opr =  String::toUpperCase; //Line n1
        System.out.println(opr.operate("lambda and method references"));
        Printer<Integer> obj=System.out::println;
        obj.print(10);
        MyPrinter<Integer> myPrinter= new MyPrinter<>();
        Printer<Integer> obj1=myPrinter::print;
        obj1.print(20);


    }
}