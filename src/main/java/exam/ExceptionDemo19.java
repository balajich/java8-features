package exam;

//Catching multiple Exceptions
class MyFileNew implements  AutoCloseable{

    @Override
    public void close() {
        System.out.println("Hello");
    }
}
public class ExceptionDemo19 {

    public static void main(String[] args) {
        try(MyFileNew f= new MyFileNew();){
            throw new RuntimeException("Hello");
        }

    }
}
