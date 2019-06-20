package features.lambda;

/***
 * Create a thread using function interface Runnable
 */
public class Demo08FunctionalInterFaceThreadLambda {
    public static void main(String[] args) throws InterruptedException {
        // create a thread using lambda expression
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);

            }//end of for
        }//end of block
        );
        // Start thread
        thread.start();
        // wait till thread finishes
        thread.join();

        System.out.println("Main Exited");
    }
}
