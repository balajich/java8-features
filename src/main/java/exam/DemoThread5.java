package exam;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoThread5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(()-> System.out.println("I am runnable"));
        Future<String> result = service.submit(() -> "I am callable");
        System.out.println(result.get());
        service.shutdown();
    }
}
