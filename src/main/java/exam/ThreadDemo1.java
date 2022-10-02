package exam;

// Providing a Runnable object to the Thread constructor
public class ThreadDemo1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println("Printing record: " + i);
    }

    public static void main(String[] args) {
        new Thread(new ThreadDemo1()).start();
    }
}