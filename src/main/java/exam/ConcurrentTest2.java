package exam;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;


public class ConcurrentTest2 {
    static class Luck {
        public AtomicBoolean coin = new AtomicBoolean(false);

        synchronized void flip() {
            coin.getAndSet(!coin.get());
        }
    }
    public static void main(String[] args) {
         var luck= new Luck();
        var service=Executors.newCachedThreadPool();
        for(int i=0;i<1000;i++){
            service.submit(()->luck.flip());
        }
        service.shutdown();
        System.out.println(luck.coin.get());

    }
}
