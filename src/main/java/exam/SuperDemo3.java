package exam;

class A1S{
    int i;
    void happy(){
        System.out.println("exam.A1S happy");
    }
}
class B1S extends A1S{
    int i;
    @Override
    void happy() {
        System.out.println("exam.B1S Happy");
        super.happy();
        System.out.println(super.i);
        System.out.println(i);
    }
}
public class SuperDemo3 {
    public static void main(String[] args) {
        B1S b1S= new B1S();
        b1S.happy();
    }
}
