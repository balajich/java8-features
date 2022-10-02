package ya00001;
class A{
    }
class B extends A{

}
public class Test {
    public static void main(String[] args) {
        //B b= new A();//not permitted
        A a=  new B();//permitted
        B b= (B)new A();// permitted only when type cast

    }
}
