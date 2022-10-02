package ya00050;

import java.util.Arrays;

enum FLAGS{
    TRUE,FALSE;
    FLAGS(){
        System.out.println("I am constructor");
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println(FLAGS.valueOf("Hello"));
    }

}

