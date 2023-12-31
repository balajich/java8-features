package threads;

public class ThreadDemo extends  Thread{
    @Override
    public void run() {
        System.out.println("Run is called");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t= new ThreadDemo();
        t.start();
        t.join();
        System.out.println("Main Exited");
    }
}
