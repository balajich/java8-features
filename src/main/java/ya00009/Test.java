package ya00009;

public class Test {
    public static void main(String[] args) {
       Integer i=10; // Ok because of auto boxing
        //Double d=10;//Not Ok because auto boxing and type casting cannot be done at one
        Double d=(double)10;//Ok autoboxing
        double d1=i; //just autoboxing
        Double d2=Double.valueOf(i);// ok
        //Double d3=(Double) i;// Not ok, Cannot be Integer cannot be cast to Double
    }
}
