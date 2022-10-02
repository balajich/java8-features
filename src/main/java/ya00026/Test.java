package ya00026;

@interface Exercise {
int hoursPerDay();
int startHour() default 6;
}
@Exercise(hoursPerDay = 2)
class Cheetah{

}
public class Test {

    public static void main(String[] args) {
        @Exercise(hoursPerDay = 10) String animal="Horse";
        @Exercise(hoursPerDay = 2,startHour = 1) String a1="Cheetah";
        animal.repeat(3);
    }
}
