package exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Supplier<LocalDate> s1= ()->LocalDate.now();
        System.out.println(s1.get());
        Supplier<LocalDate> s2= LocalDate::now;
        System.out.println(s2.get());

        Supplier<String> s3=String::new;
        System.out.println(s3.get());

        Supplier<String> s4=()-> new String();
        System.out.println(s4.get());

        Supplier<ArrayList<String>> s5= ArrayList<String>::new;
        System.out.println(s5.get());



    }
}
