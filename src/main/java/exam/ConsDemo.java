package exam;

public class ConsDemo {
   private ConsDemo(){

   }

    public static void main(String[] args) {
        ConsDemo consDemo= ConsDemo.valueOf();
        System.out.println(consDemo);
        consDemo.sayHello();
    }
    public void sayHello(){
        System.out.println("Hello ConsDemo");
    }
    public static ConsDemo valueOf(){
       return new ConsDemo();
    }
}
