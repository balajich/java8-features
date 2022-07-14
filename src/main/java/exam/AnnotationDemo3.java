package exam;

@interface Exercise3 {
    int hours();

    int weight() default 100;
}

@Exercise3(hours = 1)
class Cheetha3 {

}

@Exercise3(hours = 1, weight = 150)
class Tiger3 {

}

public class AnnotationDemo3 {
    public static void main(String[] args) {

    }
}
