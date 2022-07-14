package exam;

interface i7{
     default  void hello(){
         System.out.println("exam.i5");
     }
}
interface i8{
    default void hello(){
        System.out.println("exam.i6");
    }
}
class MI3 implements i7/*,exam.i8*/{


}
public class MultipleInheritanceDemo4 {
    public static void main(String[] args) {
        MI2 mi= new MI2();
    }
}
