package exam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
        System.out.println(date.format(formatter));
    }
}
