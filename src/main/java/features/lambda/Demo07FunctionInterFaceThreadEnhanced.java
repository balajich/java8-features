package features.lambda;

/***
 * Create a thread using function interface Runnable
 */
public class Demo07FunctionInterFaceThreadEnhanced {
    public static void main(String[] args) throws InterruptedException {
        // create a thread with anonymous inner class Runnable
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);

                }
            }
        });
        // Start thread
        thread.start();
        // wait till thread finishes
        thread.join();

        System.out.println("Main Exited");
    }
}
