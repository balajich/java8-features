package ya00023;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) {
        Locale locale= new Locale("ja","jp");
        System.out.println(locale);
        System.out.println(Locale.JAPAN);
        ResourceBundle bundle = ResourceBundle.getBundle("lables", Locale.JAPAN);
        bundle.getString("name");


    }
}
