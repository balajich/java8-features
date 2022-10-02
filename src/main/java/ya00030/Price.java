package ya00030;

import java.util.Locale;

public class Price {
    //private final double value;
    private  double value;
    public Price(String value) {
        this(Double.parseDouble(value));
    }
    public Price(double value) {
        this.value=value;
    }
    public Price() {}
    public double getValue() {return value;}
    public static void main(String[] args) {
        Price p1=new Price("1.99");
        Price p2=new Price(2.99);
        Price p3=new Price();
        System.out.println(p1.getValue()+","+p2.getValue()+","+p3.getValue());
    }
}
