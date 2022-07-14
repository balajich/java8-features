package exam;

interface ICA2{
    void hello1();
    default void hello2(){
        System.out.println("Hello2");
    }
    default void hello3(){
        System.out.println("Hello3");
    }
    private void helloPrivate1(){
        System.out.println("helloPrivate1");
    }

    private void helloPrivate2(){
        System.out.println("helloPrivate2");
    }
}
interface ICA1 {
    void show();
    default void generalInfo(){
        System.out.println("Hello");
    }
    private void thisIsPrivate(){
        System.out.println("I am private method");
    }
}
public class CommonAnnotationDemo2 {
    public static void main(String[] args) {
        ICA1 ICA1 = ()-> System.out.println("Hello");
        ICA1 i2= ()->{
          int arr[]= new int[10];
          for(int i: arr){
              System.out.println(i);
          }
        };
        ICA1 i3=()->{
            Integer arr[]={1,2,3};
            for(Integer i:arr){
                System.out.println(i);
            }
        };
        ICA1.show();
        i2.show();
        i3.show();
        i3.generalInfo();
        ICA2 ica2=()->{
            System.out.println("I am hello1");
        };
        ica2.hello1();
        ica2.hello2();
        ica2.hello3();

    }
}
