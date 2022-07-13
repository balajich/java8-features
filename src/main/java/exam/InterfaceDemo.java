package exam;

interface AI1{
    void hello();
}
class AI1Imp implements AI1{

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        AI1 ai1= new AI1Imp();
        ai1.hello();
    }
}
