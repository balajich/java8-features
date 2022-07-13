package exam;

import java.util.function.Predicate;

class InnerClassDemo0 {
    static int i=0;
    static class A{
        public static void hello(){
            System.out.println(i);
        }
    }

}

//Member inner class can access instance members
 class InnerClassDemo1 {

     int i=0;
      class A{
         public  void hello(){
             System.out.println(i);
         }
     }

 }
 //local class
 class InnerClassDemo2 {

     int i=0;
     public void helloInner() {
         class A {
             public void hello() {
                 System.out.println(i);
             }
         }
     }//end of inner

 }
 //Anonymous class

 class InnerClassDemo3 {

     int i=0;
     public void helloInner() {
         Predicate<String> predicate= s->s instanceof String;
         boolean result = predicate.test("t");
         System.out.println(result);
     }//end of inner

 }


public class InnerClassDriver1{
    public static void main(String[] args) {
   InnerClassDemo0.A.hello();
    }
}