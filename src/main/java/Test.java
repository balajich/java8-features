interface ObjectCreator<T extends Number>{
    T create(String s);
}
 
public class Test {
    public static void main(String[] args) {
        ObjectCreator<Integer> obj = Integer::valueOf;
        System.out.println(obj.create("603"));
    }
}
