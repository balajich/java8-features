package genericsdemo;

class MyPrint<T extends Number>{
    T t;
     void  print(T   t){
         this.t=t;
        System.out.println(t.byteValue());
    }
    T get(){
         return t;
    }
}
public class WildCardsDemo {

    public static void main(String[] args) {
        MyPrint mp= new MyPrint();
        mp.print(10);
        //System.out.println(mp.print(10.2));

    }
}
