package ya00036;

public class Test {
    public static void main(String[] args) {

        m1('c');
    }
   static void m1(short s){
        System.out.println(s);
    }
   static void m1(int s){
        System.out.println("int: "+s);
    }
   static void m1(char c){
        System.out.println(c);
    }
}

