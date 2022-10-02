interface Leveller {
    int level();
}
 
public class Test2 {
    int i = 100; //Line n1

    Leveller level = () -> {
        int i = 200; //Line n2
        return this.i; //Line n3
    };

    void hello(Leveller level) {
        System.out.println(level.level());
    }

    Leveller hello1(Leveller level) {
        return level;
    }
 
    public static void main(String[] args) {
        System.out.println(new Test2().level.level()); //Line n4
        Test2 t1= new Test2();
        t1.hello(()->200);
        System.out.println(new Test2().hello1(()->100).level());
    }
}