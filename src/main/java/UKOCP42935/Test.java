package UKOCP42935;

interface Creator<T> {
    T create();
}
 
abstract class Gift {
    public Gift() {
        super();
    }
    
    public String toString() {
        return "Gift";
    }
}
 
class Book extends Gift {
    public Book() {
        super();
    }
    
    public String toString() {
        return "Book";
    }
}
 
public class Test {
    public static void main(String[] args) {
        Creator<Gift> obj = Book::new;
        System.out.println(obj.create());
    }
}
