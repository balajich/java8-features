package ya00051;

public class Test {
    private static void test() throws RuntimeException {
        throw new RuntimeException();
    }

    public static void main(String [] args) {
        try {
            test();
        } finally {
            System.out.println("GAME ON");
        }
    }
}