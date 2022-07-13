package exam;

class A1I{

}
class B1I extends A1I{

}
public class InstanceOfOperatorDemo {
    public static void main(String[] args) {
        A1I a1I= new A1I();
        B1I b1I= new B1I();
        a1I=b1I;
        System.out.println(a1I instanceof  B1I);
        System.out.println(b1I instanceof  B1I);
        System.out.println(a1I instanceof  A1I);
    }
}
