package exam;

public class OverloadingDemo {

    public void hello(char i){
        System.out.println("Char: "+i);
    }
    public void hello(long i){
        System.out.println("long: "+i);
    }
    public void hello(short i){
        System.out.println("Short: "+i);
    }
    public static void main(String[] args) {
        OverloadingDemo overloadingDemo= new OverloadingDemo();
        overloadingDemo.hello(10);
        overloadingDemo.hello((char)65);
        overloadingDemo.hello(10l);
        overloadingDemo.hello((short)10);
        overloadingDemo.hello(Integer.valueOf(10));
        overloadingDemo.hello("10");
    }
    public void hello(int i){
        System.out.println("int: "+i);
    }
    public void hello(Integer i){
        System.out.println("Integer: "+i);
    }

    public void hello(Object i){
        System.out.println("Object: "+i);
    }


}
