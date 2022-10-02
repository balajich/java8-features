package ya00014;


enum Alphabet {
    A,B,C;
    public static String getFirstLetter(){
        return A.toString();
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println(Alphabet.getFirstLetter());
    }
}
