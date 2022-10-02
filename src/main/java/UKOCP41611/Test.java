package UKOCP41611;

interface Calculation {
    void calc(int i, int j);
}
 
class MyClass {
    public void add(int i, int j) {
        System.out.println(i * j);
    }
    public static void mul(int i,int j){
        System.out.println(i*j);
    }
}

interface Printer{
    void print(String hello);
    static   void printStr(String hello){
        System.out.println(hello);
    }
}
 
public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        //Calculation calcObj = (i, j) -> System.out.println(i * j); //Line n1
        //Calculation calcObj = obj::add;
        //Calculation calcObj = (i,j)->obj.add(i,j);
        //Calculation calcObj = (var i,var j)->obj.add(i,j);
        Calculation calcObj = MyClass::mul;
        calcObj.calc(24, 12);

        Printer printerObj=System.out::println;
        printerObj.print("Hello World");
        Printer printerObj1=Printer::printStr;
        printerObj1.print("Sample Hello World");
    }
}