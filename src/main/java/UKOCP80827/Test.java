package UKOCP80827;

public class Test {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) { // This method is called
        System.out.println("Double version: " + d1 + d2);
    }

    public static void main(String[] args) {
        add(10.0, null);//Wrapper class method is called

    }
}
