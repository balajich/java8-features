interface I1{
    void print(String s);
}

interface I2{
    String print(String s);
}
public class Test3 {
    public static void main(String[] args) {
        I1 i1= x-> System.out.println(x);
        i1.print("Hello World");
        i1=x-> System.out.println(x.toLowerCase());
        i1.print("Hello World");
        I2 i2= x->x.toUpperCase();
    }
}
