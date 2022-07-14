package exam;

@interface A7 {
    String value() default "exam.A7";

    String name() default "Alex";

    String gender() default "None";
}

public class AnnotationDemo7 {
    @A7("Super Annotation")
    public void hello() {

    }

    public static void main(String[] args) {

    }
}
