package exam;

@interface A6{
int armLength=10;
String stroke();
String name();
String favoriteStroke() default "BackStroke";
}
public class AnnotationDemo6 {
    @A6(stroke = "BackStoke",name = "Alex")
    public void hello(){

    }
    public static void main(String[] args) {

    }
}
