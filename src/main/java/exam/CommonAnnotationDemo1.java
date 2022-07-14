package exam;

class CA1 {


    void hello() {
        System.out.println("exam.CA1");
    }
}

class CB1 extends CA1 {

    @Override
    void hello() {
        System.out.println("exam.CB1");
    }
}

public class CommonAnnotationDemo1 {
    public static void main(String[] args) {
        CB1 cb1= new CB1();
        cb1.hello();
    }
}
