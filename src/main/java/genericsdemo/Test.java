package genericsdemo;

class A{
    void print(){
        System.out.println("I am print");
    }
}
class Print<T extends A>{
    void show(A t){
        t.print();
    }
}
public class Test {
    public static void main(String[] args) {
        Print<A> p = new Print<>();
        p.show(new A());
    }


}
