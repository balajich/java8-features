package exam;

//Stack overflow
public class ExceptionDemo12 {
    private static void hello() {
        hello();
    }

    public static void main(String[] args) {
        ExceptionDemo12.hello();
    }
}
