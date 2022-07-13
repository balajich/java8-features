package exam;

//Catching multiple Exceptions
class MyFile implements  AutoCloseable{

    @Override
    public void close() {
        System.out.println("Hello");
    }
}
public class ExceptionDemo18 {

    public static void main(String[] args) {
        try(MyFile f= new MyFile();){
        }
        System.out.println("Done");
    }
}
