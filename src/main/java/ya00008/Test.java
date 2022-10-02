package ya00008;


import java.util.ArrayList;
import java.util.List;

interface i1{
 List m1();
}
interface i2{
 ArrayList m1();
}
interface i3 extends i1,i2{ // This is ok and method with ArrayList as return type is used

}
class A implements i3{
    @Override
    public ArrayList m1() {
        return null;
    }
}
public class Test {
    public static void main(String[] args) {
    }
}
