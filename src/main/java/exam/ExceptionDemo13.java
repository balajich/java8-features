package exam;

//Stack overflow
public class ExceptionDemo13 {
    private static void hello() {
        hello();
    }

    public static void main(String[] args) {
        ExceptionDemo13.hello();
    }
}
