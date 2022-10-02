package exam;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo2 {
    public static void main(String... unused) throws ExecutionException, InterruptedException {
        //ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<?> result1 = service.submit(() -> System.out.println("Hello World"));
        Future<Integer> result2 = service.submit(() -> 10);
        System.out.println(result1.get());
        System.out.println(result2.get());

    }
}
