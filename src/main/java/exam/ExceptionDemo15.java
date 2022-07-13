package exam;

//Catching Exception
public class ExceptionDemo15 {


    public static void main(String[] args) {
        try{
            args[0]="S";
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
