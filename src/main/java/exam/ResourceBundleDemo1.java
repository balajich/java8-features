package exam;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * name.properties
 * name=Name
 * name_en_us.properties
 * name=Name en us
 */
public class ResourceBundleDemo1 {
    public static void main(String[] args) {
        var rb = ResourceBundle.getBundle("name", new Locale("hi", "IN"));
        System.out.println(rb.getString("name"));
        System.out.println(rb.getString("unknown")); // Throws java.util.MissingResourceException
    }
}
