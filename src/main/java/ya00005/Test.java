package ya00005;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
     try{
         doA();
         doB();
     }catch (IOException ioe){
         System.out.println("c");
     }finally {
         System.out.println("d");
     }
        System.out.println("e");//This will be never executed
    }
    //output will be "a b"
    static void doA(){
        System.out.println("a");
        throw  new ArrayIndexOutOfBoundsException();
    }
    static void doB() throws FileNotFoundException{
        System.out.println("b");
        throw  new FileNotFoundException();
    }
}
