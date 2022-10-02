package ya00024;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) {
        Locale locale= new Locale("ja","jp");
       Locale.setDefault(Locale.Category.FORMAT,Locale.JAPAN);

    }
}
