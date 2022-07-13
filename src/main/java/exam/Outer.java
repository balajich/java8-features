package exam;

public class Outer {
    class Inner extends Outer{

    }

    public void hello(){
        Inner i1 = new Inner();
        Inner i2 = new Outer.Inner();
        Inner i3 = new Outer().new Inner();

    }
    public static void main(String[] args) {

    }
}
