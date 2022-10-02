package UKOCP14490;

interface Creator{
    Book create();
}
 
class Book {
    public Book() {
        System.out.println(1);
    }
    
    public String toString() {
        return "2";
    }
}
 
public class Test {
    public static void main(String[] args) {
        //Creator<Book> obj = Book::new;
        Creator obj= Book::new;
        obj.create().toString();
    }
}