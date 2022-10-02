package exam;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        NumberFormat usNumber = NumberFormat.getInstance(Locale.US);
        NumberFormat germanNumber = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(usNumber.format(100.2));
        System.out.println(germanNumber.format(100.2));

    }
}
