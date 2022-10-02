package ya00038;

public class Test {

    {
        System.out.println("I am instance initializer");
    }

    public static void main(String[] args) {
        Test t1= new Test();
        Test t2= new Test();
    }

    static {
        System.out.println("I am static initializer");
    }
}

