package exam.p1;

import exam.p2.B;

public class A {
    public B b=null;
    public A(){
        b= new B();
    }
    public void sayHello(){
        System.out.println("Hello class A");
    }

    public static void main(String[] args) {
        System.out.println("This is call A in package p1");
        A a= new A();
        a.b.sayHello();
    }
}
