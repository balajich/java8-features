package exam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@interface A12{

}
@A12
public class AnnotationDemo12 {
    public static void main(String[] args) {
        System.out.println("exam.AnnotationDemo12");
    }
}
