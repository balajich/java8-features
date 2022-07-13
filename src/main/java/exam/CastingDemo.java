package exam;

class A1Ca{
    void hello(){
        System.out.println("exam.A1C hello");
    }
}
class B1Ca extends A1Ca{
    void hello(){
        System.out.println("exam.B1C hello");
    }
    void helloB1C(){
        System.out.println("exam.B1C helloB1C");
    }
}
public class CastingDemo {
    public static void main(String[] args) {
        A1Ca parent=new B1Ca();
        parent.hello();
        B1Ca child=(B1Ca) parent;
        child.helloB1C();

//        exam.B1C child2=(exam.B1C) new exam.A1C();
//        child2.helloB1C();
    }
}
