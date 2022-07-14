package exam;

import java.lang.annotation.*;

@Repeatable(A15s.class)
@interface A15{
    int value() default 10;
}
@interface A15s{
    A15[] value();
}
@A15s({@A15(1),@A15(2)})
public class AnnotationDemo15 {

    @A15
    private String message = "Hello";

    public static void main(String[] args) {
        System.out.println("exam.AnnotationDemo14");
    }
}
