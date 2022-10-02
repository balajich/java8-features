package ya00027;

@interface Injured {
    String veterinarian() default "unassigned";

    String value() default "foot";

    int age() default 1;
    String[] places() default {"UK","INDIA"} ;
}


public class Test {
    @Injured("Legs")
    public void fallDown() {
    }

    @Injured(value = "Hands",veterinarian = "Alex",age = 2,places = {"JP","FR"})
    public void fallSteep() {
    }
}
