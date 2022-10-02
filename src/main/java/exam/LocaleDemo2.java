package exam;

import java.util.Locale;

public class LocaleDemo2 {
    public static void main(String[] args) {
        Locale l1 = new Locale.Builder().setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(l1);


    }
}
