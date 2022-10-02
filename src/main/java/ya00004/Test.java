package ya00004;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class A{
    public void m1(Collection arg){
        System.out.println("A m1");
    }
}
class B extends  A{
    public void m1(Collection arg){
        System.out.println("B m1");
    }
    public void m1(List arg){
        System.out.println("B m1 list");
    }
    public void m2(){
        System.out.println("I hate this");
    }
}

public class Test {
    public static void main(String[] args) {
    List<String> li= new ArrayList<>();
    A a= new B();
    a.m1(li);//This calls method m1 in classB, prints output B m1
    //a.m2();//not possible to call method m2 via reference A
    }
}
