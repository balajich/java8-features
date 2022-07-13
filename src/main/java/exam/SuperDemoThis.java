package exam;

class AS{
    int i=10;
}
class BS extends AS{
    int i=11;
    public void hello(int i){
        System.out.println("Parameter "+i);
        System.out.println("Class exam.B i "+this.i);
        System.out.println("Class exam.A i "+super.i);
    }
}
public class SuperDemoThis {
    public static void main(String[] args) {
        BS b= new BS();
        b.hello(12);
    }
}
