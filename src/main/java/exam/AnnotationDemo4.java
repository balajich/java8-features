package exam;

@interface Exercise4 {
    int hours();

    int weight() default 100;

    String type() default "domestic";
    double cost() default 10.2;
}

@Exercise4(hours = 1)
class Cheetha4 {

}

@Exercise4(hours = 1, weight = 150)
class Tiger4 {

}

public class AnnotationDemo4 {
    public static void main(String[] args) {

    }
}
