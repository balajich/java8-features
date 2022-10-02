package exam;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        Locale.setDefault(Locale.GERMANY);
        var us = new Locale("en", "US");
        var france = new Locale("fr", "FR");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", Locale.ENGLISH);
        System.out.println(rb.getString("hello"));

    }
}
