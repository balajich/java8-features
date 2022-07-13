package exam;

public class BadRecursion {
    public void hello(){
        hello();
    }

    public static void main(String[] args) {
        BadRecursion badRecursion = new BadRecursion();
        badRecursion.hello();
    }
}
