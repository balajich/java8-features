interface Parent {
    default void earn() {
        System.out.println("Earning for the family");
    }
 
    static void plan() {
        planRetirement();
        planChildrenEducation();
    }
 
    private static void planChildrenEducation() {
        //valid codes
    }
 
    private static void planRetirement() {
        //valid codes
    }
 
    String toString();
    boolean equals(Object obj);
}
 
interface Child extends Parent {
    void play();
}
 
public class Test1 {
    public static void main(String[] args) {
        Child child = () -> System.out.println("PLAYING CRICKET..."); //Line n1
        child.play(); //Line n2
    }
}