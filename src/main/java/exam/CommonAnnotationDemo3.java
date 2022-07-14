package exam;

@FunctionalInterface
interface ICA3{
    void hello1();
    default void hello2(){
        System.out.println("I am default hello2");
    }
    default void  hello3(){
        System.out.println("I am default hello3");
    }
}

public class CommonAnnotationDemo3 {
    public static void main(String[] args) {
       ICA3 ica3=()->{
           System.out.println("hello1");
       };
       ica3.hello3();
       ICA3 ica31=()->{

       };
       ica31.hello1();


    }
}
