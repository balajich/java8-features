package ya00025;

import java.time.LocalDate;
import java.util.Locale;

import static java.time.DayOfWeek.*;

public class Test {

    public static void main(String[] args) {
        var today= LocalDate.now().with(FRIDAY).getDayOfWeek();
        switch (today) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekend");
                break;
            case MONDAY:
             FRIDAY:
            System.out.println("Working");
            default:
                System.out.println("Unknown");
        }

    }
}
