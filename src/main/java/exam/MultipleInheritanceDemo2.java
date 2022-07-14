package exam;

interface i3{
     void hello();
}
interface i4{
    void hello();
}
class MI1 implements i3,i4{

    @Override
    public void hello() {
        System.out.println("I am exam.MI1");
    }
}
public class MultipleInheritanceDemo2 {
    public static void main(String[] args) {
        MI1 mi= new MI1();
        mi.hello();

    }
}
