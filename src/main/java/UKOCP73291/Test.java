package UKOCP73291;

public class Test {
    public static void main(String[] args) {
        m(1); //Integer version is called
    }

    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Integer obj) {// This is called
        System.out.println("Integer version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }
}
