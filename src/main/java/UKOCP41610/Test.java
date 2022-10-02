package UKOCP41610;

interface Creator<T> {
    T create();
}

interface MyCreator<T>{
    T create(T t);
}
public class Test {
    public static void main(String[] args) {
        //Creator<String> obj = process("  abc d")::toUpperCase;
        Creator<String> obj = "  abc d"::toUpperCase;
        System.out.println(">" + obj.create() + "<");

        MyCreator<String> myCreator=String::toUpperCase;
        System.out.println(myCreator.create("hell"));
    }
 
    private static String process(String str) {
        return str.trim();
    }
}