package exam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class InvalidLocales {
    public static void main(String[] args) {
        Locale locale = new Locale("EN");//Generates exception
        locale = new Locale("EN","US");

    }
}
