package UKOCP76324;

public class Test {
    public static void main(String[] args) {
        final int i=25000;
        final int j=25000;
        //short k=i+j; //Compilation error because it exceeds limit of 32767 (2 bytes)
        short k=10+10;
    }
}
