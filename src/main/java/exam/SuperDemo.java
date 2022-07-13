package exam;

class A{
    private int i;
    A(){
        System.out.println("Class exam.A Default constructor ");
    }
    A(int i){
        this.i=i;
        System.out.println("class exam.A");
    }
}
class B extends A{
    B(int i){
       // super(i);
        System.out.println("class exam.B");
    }

}
public class SuperDemo {
    public static void main(String[] args) {
        B b = new B(10);

    }
}
