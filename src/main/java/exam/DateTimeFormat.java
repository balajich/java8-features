package exam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        //System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); // standard format example
        //var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println(f.format(date)); // October 20, 2020 at 11:12
    }
}
