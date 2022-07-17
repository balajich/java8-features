package exam;

public class GenericsDemo1 {
    static class MyQueue<T>{
        public MyQueue(int size){

        }
        public void print(T element){
            System.out.println(element);
        }
    }

    static class MyMap<K,V>{
        public void print(K key,V value){
            System.out.println(key.toString()+value.toString());
        }
    }
    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueue<>(10);
        stringMyQueue.print("Hello");
        //stringQueue.print(1);//Not allowed


        MyMap<String,String> map= new MyMap<>();
        map.print("1","A");

    }
}
