package UKOCP50172;

public class Test {
    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf("tRuE"); //true
        Boolean b2 = Boolean.valueOf("fAlSe");//false
        Boolean b3 = Boolean.valueOf("abc");//false
        Boolean b4 = null; //null
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);

    }
}
