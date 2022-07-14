package exam;

import java.util.function.Predicate;

@FunctionalInterface
interface AD5{
    void hello();
}

@Deprecated
public class AnnotationDemo5 {

    @Deprecated
    public AnnotationDemo5(){

    }
    @Deprecated
    public static void main(@Deprecated String[] args) {
        @Deprecated
        Predicate<String> predicate= (@Deprecated String s)->false;
        AnnotationDemo5 annotationDemo5= new AnnotationDemo5();
    }
}
