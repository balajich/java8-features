package ya00020;

public class Test {
    static String instanceVariable;

    public static void main(String[] args) {
        String localVariable = "local";
        System.out.println(localVariable);
        System.out.println(Test.instanceVariable);
    }
}
