package threads;

import java.util.concurrent.*;

class Task implements Callable<String> {
    CountDownLatch countDownLatch;
    @Override
    public String call() throws Exception {
        countDownLatch.await();
        return "I am done";
    }

    public Task(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
}

public class CountDownLatchDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CountDownLatch countDownLatch= new CountDownLatch(2);
        Task t1= new Task(countDownLatch);
        Task t2= new Task(countDownLatch);
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        Future<String> result1 = executorService.submit(t1);
        Future<String> result2 = executorService.submit(t2);
        countDownLatch.countDown();
        countDownLatch.countDown();
        System.out.println(result1.get());
        System.out.println(result2.get());
        executorService.shutdown();
    }
}
