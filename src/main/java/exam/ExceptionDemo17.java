package exam;

//Catching multiple Exceptions
public class ExceptionDemo17 {


    public static void main(String[] args) {
        try {
            args[0] += 1;
        }
        finally{
            System.out.println("I will be called any way");
        }
    }
}
