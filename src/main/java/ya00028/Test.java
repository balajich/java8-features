package ya00028;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;

@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
@interface CustomerType{
    String value() default "paid";

}
public class Test {

    public static void main(String[] args) {

       //@CustomerType String lowClass="Lower Class";

    }
}
