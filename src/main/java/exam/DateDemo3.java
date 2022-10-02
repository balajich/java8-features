package exam;

import java.time.LocalDate;
import java.time.Month;

public class DateDemo3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
    }
}
