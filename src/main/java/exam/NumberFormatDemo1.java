package exam;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo1 {
    public static void main(String[] args) {
        Locale indiaLocale = new Locale("hi", "IN");
        String result = NumberFormat.getCurrencyInstance(indiaLocale).format(10.3);
        System.out.println(result);//₹10.30

    }
}
