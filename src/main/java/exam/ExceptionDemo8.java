package exam;

public class ExceptionDemo8 {
    //Unchecked exception demo
    public static void main(String[] args) throws Throwable {
        int i = 1;
        if (i == 1) {
            Throwable e= new RuntimeException("Invalid value");
            throw e;
        }
    }
}
