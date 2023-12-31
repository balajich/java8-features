package threads;

import java.util.concurrent.*;

public class ThreadDemo2 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "I am called";
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadDemo2 threadDemo2 =new ThreadDemo2();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<String> result = executor.submit(threadDemo2);
        System.out.println(result.get());
        executor.shutdown();
    }
}
