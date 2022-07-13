package exam;

interface A1m{
default void d1(){
        System.out.println("I am default");
    }
}
class A1mImpl implements  A1m{
    @Override
    public void d1() {
        System.out.println("I am overriding");
    }
}
public class AccessmodiferDemo {
    public static void main(String[] args) {
        A1m a= new A1mImpl();
        a.d1();
    }

}
