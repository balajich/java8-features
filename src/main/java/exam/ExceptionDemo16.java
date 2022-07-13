package exam;

//Catching multiple Exceptions
public class ExceptionDemo16 {


    public static void main(String[] args) {
        try{
            args[0]="S";
            Integer.parseInt("123a");
        }catch (ArrayIndexOutOfBoundsException  | NumberFormatException numberFormatException) {

            System.out.println(numberFormatException);

        }
    }
}
