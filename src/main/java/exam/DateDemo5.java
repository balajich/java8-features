package exam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo5 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        System.out.println(dateFormat.format(new Date()));

    }
}
