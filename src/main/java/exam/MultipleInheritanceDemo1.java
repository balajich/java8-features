package exam;

interface i1{
    default void helloI1(){
        System.out.println("I1");
    }
}
interface i2{
    default void helloI2(){
        System.out.println("I2");
    }
}
class MI implements i1,i2{

}
public class MultipleInheritanceDemo1 {
    public static void main(String[] args) {
        MI mi= new MI();
        mi.helloI1();
        mi.helloI2();
    }
}
