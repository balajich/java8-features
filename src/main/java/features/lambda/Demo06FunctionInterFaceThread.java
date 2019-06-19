package features.lambda;

/***
 * Create a thread using function interface Runnable
 */
public class Demo06FunctionInterFaceThread {
    public static void main(String[] args) throws InterruptedException {
        //Create a Runnable anonymous class and instantiate it
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);

                }
            }
        };

        // create a thread
        Thread thread = new Thread(r);
        // Start thread
        thread.start();
        // wait till thread finishes
        thread.join();

        System.out.println("Main Exited");
    }
}
