package ya00033;

public class Test {

    public static void main(String[] args) {
         String s1="helloworld";
         String s2="hello"+"world";
        System.out.println(s1==s2);
        String s3="hello"+"world".trim();
        System.out.println(s1==s3.intern());
        System.out.println(1/2);
        System.out.println(1%2);
        System.out.println(1+'a');
        System.out.println(1+"a");
        short s=10;
        System.out.println(10+s);
        hello(10);
        hello('c');
        int l=0,m=0,n=0;
        var k=l=m=n=20;
        System.out.println(l+""+m+""+n);
        System.out.println(k);
    }
    private static void hello(int i){
        System.out.println(i);
    }
}
