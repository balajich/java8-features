package ya00029;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface AuthorInfo {
    String author() default "";
    String date();
    String[] comments() default{};
}
public class Test {


}
