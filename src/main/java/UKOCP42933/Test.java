package UKOCP42933;

interface Creator<T, R> {
    R create(T t);
}
 
class Log {
    
    Log() {
        System.out.println(1);
    }
    
    Log(String name) {
        System.out.println(2);
    }
    
}
 
public class Test {
    public static void main(String[] args) {

        Creator<String, Log> obj = Log::new;
        obj.create("Hello");
    }
}