package exam;

class A1C{
A1C(){

}
public  void A1C(){
    System.out.println("This is not constructor");
}
}

public class ConstructorDemo {
    public static void main(String[] args) {
        A1C a1C= new A1C();
        a1C.A1C();//fooling you
    }
}
