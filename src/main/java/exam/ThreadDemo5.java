package exam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo5 {
    public static void main(String[] args){
      Runnable task1=()->{for(int i=0;i<100;i+=2) System.out.println(i);};
      Runnable task2=()->{for(int i=1;i<100;i+=2) System.out.println(i);};
      new Thread(task1).start();
      new Thread(task2).start();
        System.out.println("Main exited");
    }
}