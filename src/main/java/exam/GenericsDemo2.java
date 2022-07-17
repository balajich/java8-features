package exam;

import java.util.Arrays;

public class GenericsDemo2 {
    static class A{
        public static <T> void show(T element){
            System.out.println(element);
        }
        public static <T> T echo(T element){
            return element;
        }
        public static <T> void showArray(T[] elements){
            for(T e:elements){
                System.out.println(e);
            }
        }

        public static <T> T[] echoArray(T[] elements){
            return elements;
        }

    }
    public static void main(String[] args) {
        A.show("Hello");
        A.show(Integer.valueOf(10));
        A.show(10);
        System.out.println(A.echo("Hello"));
        A.showArray(new Integer[]{1,2,3});
        System.out.println(Arrays.toString(A.echoArray(new Integer[]{1,2,3})));
    }
}
