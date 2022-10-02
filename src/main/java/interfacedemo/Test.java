package interfacedemo;
interface I1<U,T> {
    U hello(T t);
    default void hello(){
        System.out.println("I am hello");
    }
    public static void  helloStatic(){
        System.out.println("I am static");
    }
}
public class Test {
    public static void main(String[] args) {

        I1<Integer,String> i= Integer::valueOf;
        System.out.println(i.hello("1"));
        //i.helloStatic();


    }
}
