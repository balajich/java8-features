package ya00043;

import java.util.Arrays;
class A{
    void m1(){
        System.out.println("m1 a");
    }
}
class B extends A{
    void m1(){
        System.out.println("m1 b");
    }
    void m2(){
        System.out.println("m2 b");
    }
}
public class Test {
    public static void main(String[] args) {
    A a= new B();
    a.m1();
    //a.m2();

    }

}

