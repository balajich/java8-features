package exam;

public class ExceptionDemo9 {
    //class cast exception
    public static void main(String[] args) {
        String s="message";
        Object obj=s;
        Integer i=(Integer) obj;
    }
}
