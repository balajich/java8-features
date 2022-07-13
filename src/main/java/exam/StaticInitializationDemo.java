package exam;

public class StaticInitializationDemo {
    public static int anInt=1;
    public static void main(String[] args) {
        StaticInitializationDemo staticInitializationDemo= new StaticInitializationDemo();
        staticInitializationDemo.anInt=2;
        staticInitializationDemo=null;
        System.out.println(staticInitializationDemo.anInt);//Wired but works
    }
}
