package exam;

class Animal {
    static { System.out.print("A"); }
}
 class Hippo extends Animal {
    static { System.out.print("B"); }

}
public class ClassIntializationDemo {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
}
