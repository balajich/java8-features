package UKOCP71497;

import java.util.function.Supplier;
 
class Document {
    void printAuthor() {
        System.out.println("Document-Author");
    }
}
 
class RFP extends Document {
    @Override
    void printAuthor() {
        System.out.println("RFP-Author");
    }
}
 
public class Test {
    public static void main(String[] args) {
        check(Document::new);
        check(RFP::new);
    }
    
    private static void check(Supplier<? extends Document> supplier) {
        supplier.get().printAuthor();
    }
}