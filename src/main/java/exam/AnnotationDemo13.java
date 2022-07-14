package exam;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.FIELD})
@Inherited
@interface A13{

}
@A13
class A13Demo{

}
class A14Demo extends  A13Demo{

}
@A13
public class AnnotationDemo13 {
    public static void main(String[] args) {
        System.out.println("exam.AnnotationDemo12");
    }
}
