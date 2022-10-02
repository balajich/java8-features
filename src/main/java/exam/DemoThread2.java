package exam;

import java.util.concurrent.*;

public class DemoThread2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello World";
            }
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(callable);
        String result = future.get();
        System.out.println(result);
        service.shutdown();//Blocks all the calls
        System.out.println("End of main");

    }
}
