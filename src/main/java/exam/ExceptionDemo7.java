package exam;

public class ExceptionDemo7 {
    //Unchecked exception demo
    public static void main(String[] args) throws Exception {
        int i = 1;
        if (i == 1)
            throw new Exception("Invalid value");
    }
}
