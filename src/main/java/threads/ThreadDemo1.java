package threads;

public class ThreadDemo1 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am from Runnable");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread(new ThreadDemo1());
        t.start();
        t.join();
        System.out.println("Main Exited");
    }
}
