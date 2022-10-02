package ya00053;

public class Test {
    public static void main(String[] args) {
       try{
           try{
               try{
                   throw new RuntimeException();
               }finally {
                   System.out.println("block1");
               }
           }finally {
               System.out.println("block2");
           }
       }finally {
           System.out.println("block 3");
       }
    }
}