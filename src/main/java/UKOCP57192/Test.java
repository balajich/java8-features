package UKOCP57192;

interface DoubleToByte {
    byte getValue();
}
 
public class Test {
    public static void main(String[] args) {
        DoubleToByte obj = Integer.valueOf("123")::byteValue;
        System.out.println(obj.getValue());
    }
}