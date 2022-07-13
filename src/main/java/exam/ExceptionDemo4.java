package exam;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int i[]= new int[2];
        try {
            System.out.println(i[2]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            arrayIndexOutOfBoundsException.printStackTrace();
            System.out.println(arrayIndexOutOfBoundsException);
        }
    }
}
