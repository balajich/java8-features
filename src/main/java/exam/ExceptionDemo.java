package exam;

class E1Demo{
    void hello() throws Exception{
        System.out.println("exam.E1Demo");
    }
}
 class E2Demo extends E1Demo{
    void hello(){
        System.out.println("exam.E2Demo");
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        E2Demo e2Demo= new E2Demo();
        e2Demo.hello();
    }
}
