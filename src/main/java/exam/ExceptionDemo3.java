package exam;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int i[]= new int[2];
        try {
            System.out.println(i[2]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }
    }
}
