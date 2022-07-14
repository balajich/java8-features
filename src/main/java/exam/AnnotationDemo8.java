package exam;

@interface A8 {
    String[] geners() default {"JAZZ","CLASSIC"};
}

public class AnnotationDemo8 {
    @A8(geners = "super")
    public void hello() {

    }

    @A8(geners = {"super","megasuper"})
    public void hello1() {

    }

    public static void main(String[] args) {

    }
}
