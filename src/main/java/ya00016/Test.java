package ya00016;

public class Test {
    static {
        System.out.println("I am first and called only once");
    }

    int i;

    {
        System.out.println("I am called before constructor");
    }

    Test() {
        System.out.println("I am constructor");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
    }
}
