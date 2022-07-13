package exam;

public class AccessModifierDemo {
     void hello(){

    }
    static private final    void simple(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        AccessModifierDemo.simple();
    }

    public void test(){
         return;
    }
}
