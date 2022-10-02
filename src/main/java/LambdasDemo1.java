
public class LambdasDemo1 {
    static interface Printer{
        String print();
        // Not allowed because it is trying to Override Object toString Method
//        default String toString(){
//            return "*";
//        }
    }
}
