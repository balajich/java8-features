package exam;

public class FinalFieldDemo {
    private final int i;

    FinalFieldDemo(int i) {
        this.i = i;
    }

    void hello() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        FinalFieldDemo finalFieldDemo= new FinalFieldDemo(10);
        finalFieldDemo.hello();
    }
}
