package genericsdemo;

public class GenericMethods {
    public static <T> boolean compare(GenericsType<T> a,GenericsType<T> b){
        return a.get().equals(b.get());
    }

    public static void main(String[] args) {
        var a=new GenericsType<String>();
        var b=new GenericsType<String>();
        a.set("1");
        b.set("1");
        System.out.println(GenericMethods.compare(a,b));
    }
}
