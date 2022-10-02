package exam;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    private Lock lock= new ReentrantLock();
    public void lockUp(){
        if(lock.tryLock()){
            lock.lock();
            System.out.println("Locked");
            lock.unlock();
        }else{
            System.out.println("Hmm ..I didn't get lock");
        }
    }

    public static void main(String... unused) throws InterruptedException {
        var gate= new LockDemo();
        for(int i=0;i<5;i++){
            new Thread(()->gate.lockUp()).start();
            Thread.sleep(100);
        }

    }
}
