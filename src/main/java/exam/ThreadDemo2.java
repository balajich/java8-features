package exam;

// Creating a class that extends Thread and overrides the run() method
public class ThreadDemo2 extends Thread {
    @Override
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
        (new ThreadDemo2()).start();
    }
}