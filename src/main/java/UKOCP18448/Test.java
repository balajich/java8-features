package UKOCP18448;

public class Test {
    public static void main(String[] args) {
        extractInt(2.7);
        //extractInt(2); //Compilation error
    }
    
    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}