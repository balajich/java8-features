package exam;

import java.lang.annotation.*;

enum A14Policy {
    LINENT, HARD, SOFT
}

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@Inherited
@interface A14 {
    A14Policy[] value() default {A14Policy.LINENT, A14Policy.HARD};

    String[] friends() default {"Alex", "Stan"};
}

@A14
public class AnnotationDemo14 {
    @A14
    private String message = "Hello";

    public static void main(String[] args) {
        System.out.println("exam.AnnotationDemo14");
    }
}
