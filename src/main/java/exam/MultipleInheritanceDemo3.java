package exam;

interface i5{
     private void hello(){
         System.out.println("exam.i5");
     }
}
interface i6{
    private void hello(){
        System.out.println("exam.i6");
    }
}
class MI2 implements i5,i6{


}
public class MultipleInheritanceDemo3 {
    public static void main(String[] args) {
        MI2 mi= new MI2();
        //No problem.
        
    }
}
