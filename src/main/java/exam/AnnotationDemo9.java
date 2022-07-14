package exam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.TYPE})
@interface
A9 {
    String[] geners() default {"JAZZ","CLASSIC"};
}

//I can this it on top of other annotation
@A9
@interface A10{

}

//Declaring in single line
@A9 @interface A11{}

@A9
public class AnnotationDemo9 {
    @A9
    String name="null";


    public static void main(String[] args) {

    }
}
